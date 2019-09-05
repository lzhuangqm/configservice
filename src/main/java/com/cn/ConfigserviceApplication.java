package com.cn;

/**
 * 分布式配制服务
 */
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.config.server.*;
import org.springframework.cloud.netflix.eureka.*;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer

public class ConfigserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigserviceApplication.class, args);
    }

}
