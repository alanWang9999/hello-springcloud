package com.ssx.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName MallController
 * @Author alan.wang   QQ:3103484396
 * @Description TODO
 */
@RestController
public class MallController
{
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/search")
    public String search()
    {
        String data = restTemplate.getForEntity("http://PROJECT-SEARCH/testSearch" ,
                            String.class).getBody();
        return data;
    }

}
