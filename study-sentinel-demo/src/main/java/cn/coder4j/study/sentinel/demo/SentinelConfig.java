/*
 * coder4j.cn
 * Copyright (C) 2013-2019 All Rights Reserved.
 *
 */
package cn.coder4j.study.sentinel.demo;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author buhao
 * @version SentinelConfig.java, v 0.1 2019-01-10 11:57 buhao
 */
@Configuration
public class SentinelConfig {

    @Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }

}