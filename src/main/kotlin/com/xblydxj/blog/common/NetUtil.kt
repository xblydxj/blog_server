package com.xblydxj.blog.common

import com.alibaba.fastjson.JSONObject

/**
 * @author xblydxj.
 * @date 2020/9/4.
 * Description：
 * Email: xiezhiyong@zhexinit.com
 */
data class Response(
        val code: Int, val message: String?, val result: JSONObject?
)

fun success(result: JSONObject): Response = Response(0, "success", result)
fun failed(code: Int = 101, message: String? = "failed"): Response = Response(code, message, null)

