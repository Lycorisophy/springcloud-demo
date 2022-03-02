package cn.lysoy.stock.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * 类描述：库存管理
 *
 * @author: lysoy
 * @email: s2295938761@163.com
 * @date: 2022/03/02
 */
@Controller
@RequestMapping("/stock")
@Slf4j
public class StockController {
    @RequestMapping("/reduct")
    @ResponseBody
    public String reduct(){
        log.info("扣减库存");
        RestTemplate restTemplate = new RestTemplate();
        return "扣减库存";
    }
}
