package com.ssx.mall.controller;

import com.ssx.mall.MallProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpSession;

/**
 * @ClassName MallController
 * @Author alan.wang   QQ:3103484396
 * @Description TODO
 */
@RestController
public class MallController
{
    public static Logger logger = LoggerFactory.getLogger(MallController.class);


    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/search")
    public String search(String content)
    {
        logger.info("执行了查询:" + content);
        String data = restTemplate.getForEntity("http://PROJECT-SEARCH/testSearch" ,
                            String.class).getBody();
        logger.info("data:" + data);
        return data;
    }

}
