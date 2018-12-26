/*
 * coder4j.cn
 * Copyright (C) 2013-2018 All Rights Reserved.
 *
 */
package cn.coder4j.study.elasticjob.starter.demo.job;

import com.cxytiandi.elasticjob.annotation.ElasticJobConf;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

/**
 * 分片任务使用
 *
 * @author buhao
 * @version ShardingJob.java, v 0.1 2018-12-26 19:41 buhao
 */
@ElasticJobConf(name = "ShardingDemoJob", cron = "0/5 * * * * ?", shardingTotalCount = 9, jobExceptionHandler = "cn.coder4j.study.elasticjob.starter.demo.handler.CustomJobExceptionHandler", overwrite = true)
public class ShardingDemoJob implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println(shardingContext.getShardingItem());
    }
}