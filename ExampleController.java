package controller;

import model.EsealResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:liushuqiao
 * @title: ExampleController
 * @description:ps项目的测试接口，nothing more
 * @date: 10:21 2017/6/13
 * @version: v1.0.0
 */
@RestController
@RequestMapping("/example")
@EnableAutoConfiguration
public class ExampleController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    /**
     * 忽略Token验证测试
     */
    @RequestMapping("/data")
    public EsealResult getApiTestDate(@RequestParam String cName ,@RequestParam(required = false) Date date) {
        //log.info("接口中已获取到了数据，时间为：{},数据为：{}",System.currentTimeMillis(),cName);
        Map<String,Object> map= new HashMap<String,Object>(2);
        map.put("cName","一个冒烟的测试接口,传输的数据为：" + cName);
        map.put("date",date);
        this.handleSuc(map);
        return this.result;
    }

    public static void main(String[] args) {
        SpringApplication.run(ExampleController.class, args);
        System.out.println("============= SpringBoot Start Success =============");
    }
}
