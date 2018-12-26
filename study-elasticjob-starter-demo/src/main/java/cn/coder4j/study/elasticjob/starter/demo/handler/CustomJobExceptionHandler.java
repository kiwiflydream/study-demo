/*
 * coder4j.cn
 * Copyright (C) 2013-2018 All Rights Reserved.
 *
 */
package cn.coder4j.study.elasticjob.starter.demo.handler;

import com.dangdang.ddframe.job.executor.handler.JobExceptionHandler;

/**
 * 异常处理器
 *
 * @author buhao
 * @version CustomJobExceptionHandler.java, v 0.1 2018-12-26 20:42 buhao
 */
public class CustomJobExceptionHandler implements JobExceptionHandler {
    @Override
    public void handleException(String s, Throwable throwable) {
        System.out.println("任务: " + s + "运行出现异常：" + throwable.getMessage());
    }
}