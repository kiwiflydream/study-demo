/*
 * coder4j.cn
 * Copyright (C) 2013-2019 All Rights Reserved.
 *
 */
package cn.coder4j.study.sentinel.demo;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphO;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.junit.Test;

/**
 * @author buhao
 * @version ResourceTest.java, v 0.1 2019-01-10 11:26 buhao
 */
public class ResourceTest {

    /**
     * 通过异常定义资源
     */
    @Test
    public void testException() {

        Entry entry = null;

        try {
            // 进入资源
            entry = SphU.entry("TEST");

            System.out.println("Hello Sentinel!");

        } catch (BlockException e) {
            e.printStackTrace();
            System.out.println("资源访问被阻止，被限流或被降级!");
        } finally {
            // 务必保证会退出
            if (entry != null) {
                entry.exit();
            }
        }
    }

    /**
     * 通过 boolean 值定义资源
     */
    @Test
    public void testBool() {

        if (SphO.entry("TEST")) {
            try {
                System.out.println("Hello Sentinel!");
            } finally {
                // 务必保证会退出
                SphO.exit();
            }
        } else {
            System.out.println("资源访问被阻止，被限流或被降级!");
        }

    }
}