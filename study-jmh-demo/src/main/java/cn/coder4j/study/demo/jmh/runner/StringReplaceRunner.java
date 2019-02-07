/*
 * coder4j.cn
 * Copyright (C) 2013-2019 All Rights Reserved.
 *
 */
package cn.coder4j.study.demo.jmh.runner;

import cn.coder4j.study.demo.jmh.benchmark.StringReplaceBenchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * @author buhao
 * @version StringBuilderRunner.java, v 0.1 2018-12-25 09:53 buhao
 */
public class StringReplaceRunner {

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                // 导入要测试的类
                .include(StringReplaceBenchmark.class.getSimpleName())
                // 预热5轮
                .warmupIterations(5)
                // 度量10轮
                .measurementIterations(10)
                .mode(Mode.Throughput)
                .forks(3)
                .build();

        new Runner(opt).run();


    }

}