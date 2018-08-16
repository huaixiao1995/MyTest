package com.ntdh;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @TiTle: MysqlProperties.java
 * @Package: com.ntdh
 * @Describe: 
 * @author: zhup
 * @date: 2018年7月26日下午2:14:51
 * @version: V1.0  
 * 注意：本内容为南通东华软件有限公司内部资料，仅限于内部传阅，禁止外泄以及用于其他的商业目的
 */
@Component
@ConfigurationProperties(prefix="msyql")
public class MysqlProperties {
	
	private String jdbcName;
    
    private String dbUrl;
     
    private String userName;
     
    private String password;
 
    public String getJdbcName() {
        return jdbcName;
    }
 
    public void setJdbcName(String jdbcName) {
        this.jdbcName = jdbcName;
    }
 
    public String getDbUrl() {
        return dbUrl;
    }
 
    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }
 
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
}
