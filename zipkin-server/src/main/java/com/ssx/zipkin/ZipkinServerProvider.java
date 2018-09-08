package com.ssx.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @ClassName ZipkinServerProvider
 * @Author alan.wang   QQ:3103484396
 * @Description TODO
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerProvider
{
    public static void main(String[] args)
    {
        SpringApplication.run(ZipkinServerProvider.class , args);
    }
}
