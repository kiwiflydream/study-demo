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
 * @author buhao
 * @version JobWithHandlerAndListener.java, v 0.1 2018-12-26 20:54 buhao
 */
@ElasticJobConf(name = "JobWithHandlerAndListener", cron = "0/5 * * * * ?", shardingTotalCount = 9, overwrite = true, listener = "cn.coder4j.study.elasticjob.starter.demo.listener.CustomJobListener", jobExceptionHandler = "cn.coder4j.study.elasticjob.starter.demo.handler.CustomJobExceptionHandler")
public class WithHandlerAndListenerJob implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        // 测试异常监控
        if (shardingContext.getShardingItem() == 3) {
            int i = 1 / 0;
        }
        System.out.println(shardingContext.getShardingItem());
    }
}