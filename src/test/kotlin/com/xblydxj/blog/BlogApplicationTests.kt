package com.xblydxj.blog

import com.xblydxj.blog.bean.Article
import com.xblydxj.blog.mapper.ArticleDao
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest
class BlogApplicationTests {

    @Autowired
    private lateinit var articleDao: ArticleDao

    @Test
    fun contextLoads() {
        val article = Article().apply {
            id = 0
            comments = 1
            title = "111"
            content = "xxxx"
            reads = 1
            pictures = "[{\"xxx\":\"ddd\"}]"
            time = "2020-08-13"
            type = 1
        }
        articleDao.insert(article)
    }

}
