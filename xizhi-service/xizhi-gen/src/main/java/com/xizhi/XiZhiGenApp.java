package com.xizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.xizhi.system.annotation.EnableRyFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.xizhi.*.mapper")
@EnableRyFeignClients
public class XiZhiGenApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(XiZhiGenApp.class, args);
    }
}
