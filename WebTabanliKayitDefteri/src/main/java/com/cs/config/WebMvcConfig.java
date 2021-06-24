package com.cs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.cs.dao.abstracts.IKayitDao;
import com.cs.dao.concretes.KayitDaoImpl;

@Configuration
@EnableWebMvc
@ComponentScan("com.cs")
public class WebMvcConfig {

	@Bean
	InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver vr = new InternalResourceViewResolver();

		vr.setPrefix("/");
		vr.setSuffix(".jsp");
		return vr;
	}

	
	@Bean
	DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/kayitislem");
		ds.setUsername("root");
		ds.setPassword("123456");

		return ds;
	}

	@Bean
	public IKayitDao getKayitDao() {
		return new KayitDaoImpl(getDataSource());
	}
}