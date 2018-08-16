package com.ntdh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @TiTle: HelloWorldFreemakerController.java
 * @Package: com.ntdh
 * @Describe: 
 * @author: zhup
 * @date: 2018年7月26日下午2:26:23
 * @version: V1.0  
 * 注意：本内容为南通东华软件有限公司内部资料，仅限于内部传阅，禁止外泄以及用于其他的商业目的
 */
@Controller
@RequestMapping("/freemarker")
public class HelloWorldFreemakerController {

	@RequestMapping("/say")
	public ModelAndView say(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("message", "SpringBoot hi！");
		mav.setViewName("helloWorld");
		return mav;
	}
}
