package com.ingsha.application.app.config;

import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MapperScan
 * @Description TODO
 * @Author Martin Yi
 * @Date 2023/8/23 02:10
 * @Version 1.0
 */

@Configuration
@org.mybatis.spring.annotation.MapperScan(basePackages = "com.ingsha.application.app.mysql.dao")
public class UserMapperScan {



}
