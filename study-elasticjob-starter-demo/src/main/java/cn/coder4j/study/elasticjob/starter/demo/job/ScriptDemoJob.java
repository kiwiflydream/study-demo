/*
 * coder4j.cn
 * Copyright (C) 2013-2018 All Rights Reserved.
 *
 */
package cn.coder4j.study.elasticjob.starter.demo.job;

import com.cxytiandi.elasticjob.annotation.ElasticJobConf;
import com.dangdang.ddframe.job.api.script.ScriptJob;

/**
 * @author buhao
 * @version ScriptDemoJob.java, v 0.1 2018-12-26 20:34 buhao
 */
@ElasticJobConf(name = "ScriptDemoJob", scriptCommandLine = "/Users/kiwi/work/code/study-demo/study-elasticjob-starter-demo/src/main/resources/sh/demo.sh", description = "脚本任务测试", cron = "0/3 * * * * ?", overwrite = true)
public class ScriptDemoJob implements ScriptJob {
}