package com.ex;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SprinUtil {
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/bookapp");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
		
		
		
		
		
	}
	@Bean
	public JdbcTemplate getJdbcTemplate(DataSource ds) {
		JdbcTemplate jt=new JdbcTemplate(ds);
		return jt;
		
	}
	@Bean(value="dao")
	public SpringDao getSpringDao(JdbcTemplate jt) {
		SpringDao s=new SpringDao();
		s.setJdbcTemplate(jt);
		return s;
		
	}
}
