package com.xblydxj.blog.common

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.transaction.annotation.EnableTransactionManagement

/**
 * @author xblydxj.
 * @date 2020/9/3.
 * Description：
 * Email: xiezhiyong@zhexinit.com
 */

@EnableTransactionManagement
@Configuration
class MyBatisPlusConfig {

    @Bean
    fun paginationInterceptor(): PaginationInterceptor = PaginationInterceptor()
}