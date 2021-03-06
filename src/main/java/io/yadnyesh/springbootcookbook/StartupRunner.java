package io.yadnyesh.springbootcookbook;

import io.yadnyesh.springbootcookbook.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;

import javax.sql.DataSource;

public class StartupRunner implements CommandLineRunner {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public void run(String... args) throws Exception {
		logger.info("DataSource: " + dataSource.toString());
		logger.info("Number of Books: "+ bookRepository.count());
	}
	
	//@Scheduled(initialDelay = 1000, fixedRate = 10000)
	public void run() {
		logger.info("Number of books from Scheduling: " + bookRepository.count());
	}
}
