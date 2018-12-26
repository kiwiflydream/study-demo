/*
 * coder4j.cn
 * Copyright (C) 2013-2918 All Rights Reserved.
 *
 */
package cn.coder4j.study.elasticjob.starter.demo.job;

import com.cxytiandi.elasticjob.annotation.ElasticJobConf;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

import java.util.Date;

/**
 * 调用注解设置
 *
 * @author buhao
 * @version HelloJob.java, v 0.1 2018-12-26 14:39 buhao
 */
@ElasticJobConf(name = "HelloJobByAnnotation", cron = "0/10 * * * * ?", description = "注解配置 JOB 测试", overwrite = true)
public class HelloJobByAnnotation implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println(this.getClass().getSimpleName() + "运行：" + new Date().toLocaleString());
    }
}