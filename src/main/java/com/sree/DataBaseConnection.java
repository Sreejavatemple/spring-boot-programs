package com.sree;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component("db")
//@PropertySource("classpath:p.properties")
public class DataBaseConnection {
	/*@Value("oracle.jdbc.OracleDriver")
	private String Driver;
	@Value("jdbc:oracle:thin:@localhost:1521:xe")
	private String Url;
	@Value("System")
	private String UserName;
	@Value("System")
	private String Password;*/
	@Value("${db.driver}")
	private String Driver;
	@Value("${db.url}")
	private String Url;
	@Value("${db.name}")
	private String UserName;
	@Value("${db.password}")
	private String Password;
	
	
public void DbCoon() {
	System.out.println("OracleDriver Details");
	System.out.println("=======================");
	System.out.println("Driver Name:-"+Driver);
	System.out.println("Driver Url:-"+Url);
	System.out.println("Driver User Name:-"+UserName);
	System.out.println("Driver Password:-"+Password);
}
}
