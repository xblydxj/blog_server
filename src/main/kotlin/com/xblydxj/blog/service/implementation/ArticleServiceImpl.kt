package com.xblydxj.blog.service.implementation

import com.alibaba.fastjson.JSONObject
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.plugins.pagination.Page
import com.xblydxj.blog.bean.Article
import com.xblydxj.blog.mapper.ArticleDao
import com.xblydxj.blog.service.`interface`.ArticleService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * @author xblydxj.
 * @date 2020/9/3.
 * Description：
 * Email: xiezhiyong@zhexinit.com
 */
@Service
class ArticleServiceImpl : ArticleService {

    private val logger = LoggerFactory.getLogger(ArticleServiceImpl::class.java)

    @Autowired
    lateinit var articleDao: ArticleDao

    override fun list(pages: Long?, count: Long?): JSONObject = JSONObject().apply {
        val iPage: IPage<Article> = articleDao.selectPage(Page<Article>(pages ?: 1, count ?: 10), QueryWrapper<Article>())

        put("list", iPage.records)
        put("total", iPage.total)
        put("pageNumber", iPage.size)
    }
}