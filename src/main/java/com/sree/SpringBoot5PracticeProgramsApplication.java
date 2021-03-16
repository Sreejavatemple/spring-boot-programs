package com.sree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot5PracticeProgramsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBoot5PracticeProgramsApplication.class, args);
		
	DataBaseConnection con=ctx.getBean("db",DataBaseConnection.class);
	System.out.println(con);
	con.DbCoon();
			
	}

}
