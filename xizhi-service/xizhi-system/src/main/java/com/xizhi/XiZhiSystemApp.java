package com.xizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.xizhi.system.annotation.EnableRyFeignClients;

import tk.mybatis.spring.annotation.MapperScan;

/**
 * 启动程序
 * 
 * @author xizhi
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@EnableRyFeignClients
@MapperScan("com.xizhi.*.mapper")
public class XiZhiSystemApp
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(XiZhiSystemApp.class, args);
    }
}