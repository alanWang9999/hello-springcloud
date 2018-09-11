package com.ssx.mall.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @HystrixCommand(fallbackMethod = "backMethod")
    @GetMapping("/search")
    public String search(String content)
    {
//        logger.info("执行了查询:" + content);
        System.out.println("执行了查询:" + content);
        String data = restTemplate.getForEntity("http://PROJECT-SEARCH/testSearch" ,
                            String.class).getBody();
//        logger.info("data:" + data);
        return data;
    }
    /**
     *  回路方法，在原始方法出发了断路器逻辑时执行，执行时会代替
     *  原始方法；
     *  回路方法的要求：除了方法名以外，返回值和参数列表必须和
     *  原始方法完全相同
     *  @author alan.wang   QQ:3103484396
     *	@param
     *  @return
     */
    public String backMethod(String content)
    {
        System.out.println("执行了回路方法:" + content);
//        logger.info("执行了回路方法:" + content);
        return "对不起，当前查询不可用，请稍后再试！";
    }

}
