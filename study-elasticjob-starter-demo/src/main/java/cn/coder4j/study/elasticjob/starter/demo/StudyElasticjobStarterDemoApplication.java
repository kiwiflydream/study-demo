package cn.coder4j.study.elasticjob.starter.demo;

import com.cxytiandi.elasticjob.annotation.EnableElasticJob;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 启动 elastic job
@EnableElasticJob
public class StudyElasticjobStarterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyElasticjobStarterDemoApplication.class, args);
    }

}

