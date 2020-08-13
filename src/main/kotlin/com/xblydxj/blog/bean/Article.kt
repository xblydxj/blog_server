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
    @TableField("title")
    var title: String? = null
    @TableField("content")
    var content: String? = null
    @TableField("reads")
    var reads: Int? = null
    @TableField("comments")
    var comments: Int? = null
    @TableField("pictures")
    var pictures: String? = null
    @TableField("time")
    var time: String? = null
    @TableField("type")
    var type: Int? = null
}
