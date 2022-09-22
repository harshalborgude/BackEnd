package org.hrb.config;

import javax.sql.DataSource;

import org.hrb.DAO.AppDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class AppConfig {
	
	@Bean
	public DataSource getDataSource() {
		
		
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/project");
	    dataSource.setUsername("mysql");
	    dataSource.setPassword("harshal");
		
		return null;
	}
	
	@Bean(name="DAOBean")
	public AppDAOImpl AppDAO() {
		
		return new AppDAOImpl(getDataSource());
	}
	

}
