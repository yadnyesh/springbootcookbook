package io.yadnyesh.springbootcookbook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import javax.sql.DataSource;

public class StartupRunner implements CommandLineRunner {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	public void run(String... args) throws Exception {
		logger.info("DataSource: " + dataSource.toString());
	}
}
