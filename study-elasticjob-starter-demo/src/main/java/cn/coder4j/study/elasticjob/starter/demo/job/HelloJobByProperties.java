/*
 * coder4j.cn
 * Copyright (C) 2013-2018 All Rights Reserved.
 *
 */
package cn.coder4j.study.elasticjob.starter.demo.job;

import com.cxytiandi.elasticjob.annotation.ElasticJobConf;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

import java.util.Date;

/**
 * 通过配置设置
 *
 * @author buhao
 * @version HelloJobByProperties.java, v 0.1 2018-12-26 16:43 buhao
 */
@ElasticJobConf(name = "HelloJobByProperties", overwrite = true)
public class HelloJobByProperties implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println(this.getClass().getSimpleName() + "运行：" + new Date().toLocaleString());
    }
}