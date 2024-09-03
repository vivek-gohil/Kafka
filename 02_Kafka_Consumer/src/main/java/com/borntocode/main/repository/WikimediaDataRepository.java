package com.borntocode.main.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class WikimediaDataRepository {

	private JdbcTemplate jdbcTemplate;

	public WikimediaDataRepository(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public void addNewRow(String data) {
		Object[] param = { data };
		jdbcTemplate.update("insert into wikimedia_data(wikievent_data) values(?)", param);
	}

}
