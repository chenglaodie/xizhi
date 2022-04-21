package com.xizhi.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class XiZhiMonitorApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(XiZhiMonitorApp.class, args);
    }
}