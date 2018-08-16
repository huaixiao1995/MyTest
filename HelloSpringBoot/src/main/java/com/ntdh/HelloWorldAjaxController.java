package com.ntdh;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @TiTle: HelloWorldAjaxController.java
 * @Package: com.ntdh
 * @Describe: 
 * @author: zhup
 * @date: 2018年7月26日下午2:32:30
 * @version: V1.0  
 * 注意：本内容为南通东华软件有限公司内部资料，仅限于内部传阅，禁止外泄以及用于其他的商业目的
 */
@RestController
@RequestMapping("/ajax")
public class HelloWorldAjaxController {
 
    @RequestMapping("/hello")
    public String say(){
    	System.out.println("test2");
        return "{'message1': 'SpringBoothi1','message2','SpringBoothi2'}";
    }
}
