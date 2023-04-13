package com.xworkz.mobileConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("Created SpringConfiguration class ");

	}

	@Bean
	public LocalContainerEntityManagerFactoryBean bean() {
		System.out.println("created LocalContainerEntityManagerFactoryBean");
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return factoryBean;

	}

	@Bean
	public ViewResolver resolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver("/",".jsp");
		return viewResolver;

	}

}
