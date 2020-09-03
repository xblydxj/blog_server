package com.xblydxj.blog.controller

import com.alibaba.fastjson.JSONObject
import com.xblydxj.blog.service.`interface`.ArticleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * @author xblydxj.
 * @date 2020/8/13.
 * Description：
 * Email: xiezhiyong@zhexinit.com
 */
@RestController
@RequestMapping("/article")
class ArticleController {

    @Autowired
    lateinit var articleService: ArticleService

    @GetMapping("/list")
    fun list(@RequestParam requestParam: Map<String, String?>): JSONObject = articleService.list(requestParam["pages"]?.toLong(), requestParam["count"]?.toLong())


}