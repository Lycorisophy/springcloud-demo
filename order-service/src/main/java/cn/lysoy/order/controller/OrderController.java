package cn.lysoy.order.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * 类描述：订单管理
 *
 * @author: lysoy
 * @email: s2295938761@163.com
 * @date: 2022/03/02
 */
@Controller
@RequestMapping("/order")
@Slf4j
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    @ResponseBody
    public String add() {
        log.info("下单成功");
        final String str = restTemplate.getForObject("http://localhost:8082/stock/reduct", String.class);
        return str;
    }
}
