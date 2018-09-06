package com.ssx.project.search.controller;

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

    @GetMapping("/testSearch")
    public String testSearch()
    {
        System.out.println("----testSearch-----");
        return "测试!!!!!!!";
    }

}
