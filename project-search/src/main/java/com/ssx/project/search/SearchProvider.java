package com.ssx.project.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName SearchProvider
 * @Author alan.wang   QQ:3103484396
 * @Description TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SearchProvider
{
    public static void main(String[] args) {
        SpringApplication.run(SearchProvider.class , args);
    }
}
