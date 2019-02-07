/*
 * coder4j.cn
 * Copyright (C) 2013-2019 All Rights Reserved.
 *
 */
package cn.coder4j.study.sentinel.demo;

import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @author buhao
 * @version AnnoResourceTest.java, v 0.1 2019-01-23 15:19 buhao
 */
public class AnnoResourceTest extends StudySentinelDemoApplicationTests {

    @Autowired
    private AnnoResource annoResource;

    private static void initFlowRules() {
        List<FlowRule> rules = new ArrayList<>();
        FlowRule rule = new FlowRule();
        rule.setResource("resourceMethod");
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        // Set limit QPS to 20.
        rule.setCount(20);
        rules.add(rule);
        FlowRuleManager.loadRules(rules);
    }

    @Test
    public void testAnno() {

        initFlowRules();

        while (true) {
            try {
                System.out.println(annoResource.resourceMethod());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}