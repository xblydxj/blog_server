package com.xblydxj.blog.controller

import com.xblydxj.blog.bean.Article
import com.xblydxj.blog.mapper.ArticleDao
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.logging.Logger

/**
 * @author xblydxj.
 * @date 2020/8/13.
 * Description：
 * Email: xiezhiyong@zhexinit.com
 */
@RestController
class ArticleController {
    private val logger = LoggerFactory.getLogger(ArticleController::class.java)

    @Autowired
    lateinit var articleDao: ArticleDao

    @GetMapping("/test")
    fun test(): String {
        val article = Article().apply {
            comments = 1
            title = "111"
            content = "xxxx"
            reads = 1
            pictures = "[{\"xxx\":\"ddd\"}]"
            time = "2020-08-13"
            type = 1
        }
        val id1 = articleDao.insert(article)
        val id2 = articleDao.updateById(article)
        logger.info("insert$id1   update$id2")
        return article.toString()
    }
}