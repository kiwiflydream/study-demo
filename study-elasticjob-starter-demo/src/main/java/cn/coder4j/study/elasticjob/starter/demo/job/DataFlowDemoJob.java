/*
 * coder4j.cn
 * Copyright (C) 2013-2018 All Rights Reserved.
 *
 */
package cn.coder4j.study.elasticjob.starter.demo.job;

import com.cxytiandi.elasticjob.annotation.ElasticJobConf;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * 数据流任务
 *
 * @author buhao
 * @version DataFlowDemoJob.java, v 0.1 2018-12-26 20:27 buhao
 */
@ElasticJobConf(name = "DataFlowDemoJob", cron = "0/5 * * * * ?", description = "数据流任务测试", overwrite = true)
public class DataFlowDemoJob implements DataflowJob<String> {
    @Override
    public List<String> fetchData(ShardingContext shardingContext) {
        return Lists.newArrayList("1", "2", "3");
    }

    @Override
    public void processData(ShardingContext shardingContext, List<String> list) {
        System.out.println(list);
    }
}