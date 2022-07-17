package com.string.triming.stringtriming2;

import com.string.triming.stringtriming2.anotations.EnableStringTrimming;
import com.string.triming.stringtriming2.beans.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableStringTrimming
public class StringTriming2Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
			.run(StringTriming2Application.class, args);
		Test bean = context.getBean(Test.class);
		System.out.println("   boll   ");
		System.out.println(bean.trString("   boll  "));
	}

}
