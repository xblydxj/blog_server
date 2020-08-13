package com.xblydxj.blog.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.xblydxj.blog.bean.Article
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository


/**
 * @author xblydxj.
 * @date 2020/8/13.
 * Description：
 * Email: xiezhiyong@zhexinit.com
 */
@Repository
@Mapper interface ArticleDao : BaseMapper<Article>