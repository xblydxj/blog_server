package com.xblydxj.blog.common

/**
 * @author xblydxj.
 * @date 2020/9/3.
 * Description：
 * Email: xiezhiyong@zhexinit.com
 */
class CommonException(private var code: Int, message: String?) : RuntimeException(message) {

    fun getCode(): Int {
        return code
    }

    override fun toString(): String {
        return "CommonException code: " + code + " " + super.toString()
    }

    companion object {
        private const val serialVersionUID = -1L
    }
}