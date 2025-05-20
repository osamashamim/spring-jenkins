package com.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJekinsApplicationTests {
	public static Logger logger=LoggerFactory.getLogger(SpringJekinsApplicationTests.class);
	@Test
	 contextLoads() {
		logger.info("test case executing..!!");
		logger.info("test case executing.second log.!!");
		assertEquals(true, true);
	}

}
