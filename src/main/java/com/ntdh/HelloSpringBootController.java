package com.ntdh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @TiTle: HelloSpringBootController.java
 * @Package: com.ntdh
 * @Describe: 
 * @author: zhup
 * @date: 2018年7月26日下午1:51:12
 * @version: V1.0  
 * 注意：本内容为南通东华软件有限公司内部资料，仅限于内部传阅，禁止外泄以及用于其他的商业目的
 */
@RestController
public class HelloSpringBootController {
	
	@Value("${helloSpringBoot}")
    private String helloSpringBoot;
	
	 @Value("${mysql.jdbcName}")
    private String jdbcName;
     
    @Value("${mysql.dbUrl}")
    private String dbUrl;
     
    @Value("${mysql.userName}")
    private String userName;
     
    @Value("${mysql.password}")
    private String password;
    
    @Autowired
    private MysqlProperties mysqlProperties;

	@RequestMapping("/hello")
    public String say(){
        /*return "Spring Boot hi！";*/
        return helloSpringBoot;
    }
	
	@RequestMapping("/showJdbc")
    public String showJdbc(){
       /* return "mysql.jdbcName:"+jdbcName+"<br/>"
              +"mysql.dbUrl:"+dbUrl+"<br/>"
              +"mysql.userName:"+userName+"<br/>"
              +"mysql.password:"+password;*/
		return "mysql.jdbcName:"+mysqlProperties.getJdbcName()+"<br/>"
        +"mysql.dbUrl:"+mysqlProperties.getDbUrl()+"<br/>"
        +"mysql.userName:"+mysqlProperties.getUserName()+"<br/>"
        +"mysql.password:"+mysqlProperties.getPassword();
    }
}
