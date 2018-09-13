package com.ssx.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName OrderController
 * @Author alan.wang   QQ:3103484396
 * @Description TODO
 */
@Controller
public class OrderController
{
    //能获取security的token的页面，不允许跨域访问
    @GetMapping("/toAddOrder")
    public String toAddOrder()
    {
        return "test-csrf";
    }
    @ResponseBody
    @PostMapping("/doAddOrder")
    public String doAddOrder()
    {
        System.out.println("执行下订单操作！");
        return "下单成功";
    }
}
