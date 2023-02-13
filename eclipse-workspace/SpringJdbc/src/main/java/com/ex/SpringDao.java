package com.ex;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void insert() {
		jdbcTemplate.execute("insert into college values(100,'stexe',439,'F','ECEW')");
	}
}
