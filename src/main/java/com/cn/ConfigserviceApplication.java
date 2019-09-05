package com.cn;

/**
 * 分布式配制服务
 */
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.config.server.*;

@SpringBootApplication
@EnableConfigServer

public class ConfigserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigserviceApplication.class, args);
    }

}
