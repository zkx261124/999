package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    //记录器
    Logger logger=LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {
        //日志级别 由低到高
        //可以调整输出的日志级别：日志只会在此级别及高级别生效
        logger.trace("这是： t");
        logger.debug("这是： d");
        logger.info("这是： i");
        logger.warn("这是： w");
        logger.error("这是： e");
    }

}
