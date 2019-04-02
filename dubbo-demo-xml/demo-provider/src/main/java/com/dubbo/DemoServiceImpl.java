package com.dubbo;
import org.springframework.stereotype.Service;
import com.dubbo.DemoService;
/**
 * @Author: Qy
 * @Date: 2019-04-01 18:13
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService{
    public String sayHello(String name) {
        return name;
    }
}
