package com.ingsha.application.app.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.ingsha.application.app.mysql.dao")
public class UserMapperScan {
}
