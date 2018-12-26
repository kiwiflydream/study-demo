/*
 * coder4j.cn
 * Copyright (C) 2013-2018 All Rights Reserved.
 *
 */
package cn.coder4j.study.elasticjob.starter.demo.listener;

import com.dangdang.ddframe.job.executor.ShardingContexts;
import com.dangdang.ddframe.job.lite.api.listener.ElasticJobListener;

/**
 * 任务监听器
 *
 * @author buhao
 * @version CustomJobListener.java, v 0.1 2018-12-26 20:52 buhao
 */
public class CustomJobListener implements ElasticJobListener {
    @Override
    public void beforeJobExecuted(ShardingContexts shardingContexts) {
        System.out.println("任务：" + shardingContexts.getJobName() + "开始运行");
    }

    @Override
    public void afterJobExecuted(ShardingContexts shardingContexts) {
        System.out.println("任务：" + shardingContexts.getJobName() + "开始结束");
    }
}