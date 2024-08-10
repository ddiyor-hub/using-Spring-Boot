package com.webproject.App;

import com.webproject.App.Service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(AppApplication.class, args);
		ProductService ps = context.getBean(ProductService.class);
		ps.show();
	}

}
