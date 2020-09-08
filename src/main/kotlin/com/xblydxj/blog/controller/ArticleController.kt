package com.xblydxj.blog.controller

import com.xblydxj.blog.common.Response
import com.xblydxj.blog.common.success
import com.xblydxj.blog.service.`interface`.ArticleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

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

    @PostMapping("/list")
    fun list(@RequestParam requestParam: Map<String, String?>): Response =
            success(articleService.list(requestParam["pages"]?.toLong(), requestParam["count"]?.toLong()))


}