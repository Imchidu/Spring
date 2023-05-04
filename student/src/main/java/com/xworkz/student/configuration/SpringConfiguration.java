package com.xworkz.student.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.student")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("Created SpringConfiguration class ");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean bean() {
		System.out.println("Created LocalContainerEntityManagerFactoryBean ");
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

		return factoryBean;

	}

	@Bean
	public ViewResolver resolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver("/", ".jsp");

		return viewResolver;

	}
	
	@Bean
	public MultipartResolver multipartResolver() {

		return new StandardServletMultipartResolver();

	}

}
