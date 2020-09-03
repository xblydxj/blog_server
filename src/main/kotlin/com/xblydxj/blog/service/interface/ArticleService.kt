package com.xblydxj.blog.service.`interface`

import com.alibaba.fastjson.JSONObject


/**
 * @author xblydxj.
 * @date 2020/9/3.
 * Description：
 * Email: xiezhiyong@zhexinit.com
 */
interface ArticleService {
    fun list(pages: Long?,count:Long?): JSONObject
}