/*
 * coder4j.cn
 * Copyright (C) 2013-2019 All Rights Reserved.
 *
 */
package cn.coder4j.study.demo.jmh.benchmark;

import cn.hutool.core.util.StrUtil;
import org.apache.commons.lang3.StringUtils;
import org.openjdk.jmh.annotations.Benchmark;

/**
 * @author buhao
 * @version StringReplaceBenchmark.java, v 0.1 2019-01-25 13:29 buhao
 */
public class StringReplaceBenchmark {

    public static final String TEST_STR = "[sdfd][cccc]";

    @Benchmark
    public void testStrUtil() {
        String s = StrUtil.removeAll(StrUtil.removeAll(TEST_STR, "["), "]");
        print(s);
    }

    @Benchmark
    public void testStringUtil() {
        String s = StringUtils.remove(StringUtils.remove(TEST_STR, "["), "]");
        print(s);
    }


    public void print(String str) {

    }
}