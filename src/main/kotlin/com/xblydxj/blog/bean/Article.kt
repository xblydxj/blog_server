package com.xblydxj.blog.bean

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableField
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import lombok.Data
import lombok.ToString

/**
 * @author xblydxj.
 * @date 2020/8/13.
 * Description：
 * Email: xiezhiyong@zhexinit.com
 */
@Data
@TableName(value = "article")
@ToString
class Article {
    @TableId(type = IdType.AUTO)
    var id: Int? = null

    // 标题
    @TableField("title")
    var title: String? = null

    // 内容
    @TableField("content")
    var content: String? = null

    // 阅读数
    @TableField("reads")
    var reads: Int? = null

    // 评论数
    @TableField("comments")
    var comments: Int? = null

    // 图片
    @TableField("pictures")
    var pictures: String? = null

    // 上传时间
    @TableField("time")
    var time: String? = null

    // 文章链接
    @TableField("link")
    var link: String? = null

    // 标签
    @TableField("tags")
    var tags: String? = null

    // 分类
    @TableField("")
    var category: String? = null
}
