package com.xizhi;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.xizhi.system.annotation.EnableRyFeignClients;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EnableDiscoveryClient
@MapperScan("com.xizhi.*.mapper")
@EnableRyFeignClients
public class XiZhiActApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(XiZhiActApp.class, args);
    }
}
