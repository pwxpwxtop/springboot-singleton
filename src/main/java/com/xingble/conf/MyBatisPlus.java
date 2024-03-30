package com.xingble.conf;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author pwx
 * @version 1.0
 * @describe mybatis-plus配置
 * @date 2022/9/2 14:32
 */

@Configuration
public class MyBatisPlus {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        //数据库配置
        PaginationInnerInterceptor innerInterceptor = new PaginationInnerInterceptor(DbType.MYSQL);
        //设置最大查询次数
        innerInterceptor.setMaxLimit(500L);
        interceptor.addInnerInterceptor(innerInterceptor);
        return interceptor;
    }

}
