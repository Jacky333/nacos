package com.pm.alibabanacosdiscoveryclientcommon;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2020/09/25 18:01
 */
@FeignClient("alibaba-nacos-discovery-server")
public interface Client {
    @GetMapping("/hello")
    String hello(@RequestParam(name = "name") String name);
}
