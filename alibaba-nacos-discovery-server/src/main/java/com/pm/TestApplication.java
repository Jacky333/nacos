package com.pm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2020/09/25 16:44
 */
@EnableDiscoveryClient
@SpringBootApplication
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    @Slf4j
    @RestController
    static class TestController {
        @GetMapping("/hello")
        public String hello(@RequestParam String name) {
            log.info("invoked name = " + name);
            return "hello " + name;
        }
    }
}
