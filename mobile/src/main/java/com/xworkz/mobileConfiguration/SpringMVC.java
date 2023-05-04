package com.xworkz.mobileConfiguration;


import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{
  SpringMVC(){
	  System.out.println("Created springmvc class");
  }

@Override
protected Class<?>[] getRootConfigClasses() {
 System.out.println("created getRootConfigClasses");
	return null;
}

@Override
protected Class<?>[] getServletConfigClasses() {
	 System.out.println("created getServletConfigClasses");

	return new Class[] {SpringConfiguration.class};
}

@Override
protected String[] getServletMappings() {
	System.out.println("created getServletMappings");
	return new String[] {"/"};
}

@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	configurer.enable();
	System.out.println("created configureDefaultServletHandling");
	}
}
