/*
 * coder4j.cn
 * Copyright (C) 2013-2019 All Rights Reserved.
 *
 */
package cn.coder4j.study.sentinel.demo;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Component;

/**
 * @author buhao
 * @version AnnoResource.java, v 0.1 2019-01-23 15:10 buhao
 */
@Component
public class AnnoResource {

    @SentinelResource(value = "resourceMethod", blockHandler = "blockHandlerByResourceMethod")
    public String resourceMethod() {

        throw new RuntimeException("运行时出现异常");
//        return "运行成功";
    }

    public String blockHandlerByResourceMethod(BlockException ex) {
        return "方法被限流";
    }

}