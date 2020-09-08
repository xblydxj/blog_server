package com.xblydxj.blog.common

import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.JSONObject
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.web.context.request.RequestContextHolder
import org.springframework.web.context.request.ServletRequestAttributes

/**
 * @author xblydxj.
 * @date 2020/9/3.
 * Description：
 * Email: xiezhiyong@zhexinit.com
 */

@Aspect
@Component
class ControllerAspect {
    private val log = LoggerFactory.getLogger(ControllerAspect::class.java)

    @Pointcut("execution(* com.xblydxj.blog.controller..*.*(..))")
    private fun controllerAspect() {
    }

    @Around("controllerAspect()")
    fun methodBefore(joinPoint: ProceedingJoinPoint): Any? {
        var requestParams: Map<*, *>? = null
        var responseParams: Response? = null
        val logString = StringBuilder().apply {
            try {
                val beginTime = System.currentTimeMillis()
                val requestAttributes = RequestContextHolder.getRequestAttributes() as ServletRequestAttributes?
                append("\n\n    请求地址：").append(requestAttributes?.request?.requestURL?.toString()).append("\n")
                append("    请求方式：").append(requestAttributes?.request?.method).append("\n")
                append("    请求方法：").append(joinPoint.signature.toString()).append("\n")
                joinPoint.args.forEach { if (it is Map<*, *>) requestParams = it }
                append("    请求参数：").append(JSON.toJSON(requestParams)).append("\n")
                if (joinPoint.proceed() is Response) responseParams = joinPoint.proceed() as Response
                val endTime = System.currentTimeMillis()
                append("    耗时：").append(endTime - beginTime).append(" ms\n")
                append("    返回结果：").append(JSON.toJSON(responseParams)).append("\n")
            } catch (e: Exception) {
                append("\n${e.stackTrace}")
                e.printStackTrace()
                failed(101, e.message)
            }
        }
        log.info(logString.toString())
        return responseParams
    }
}
