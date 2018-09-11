package com.ssx.project.search.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName SearchController
 * @Author alan.wang   QQ:3103484396
 * @Description TODO
 */
@RestController
public class SearchController
{
    public static Logger logger = LoggerFactory.getLogger(SearchController.class);

    @GetMapping("/testSearch")
    public String testSearch()
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("执行查询");

        return "测试!!!!!!!";
    }

}
