package com.kthsoft.springdata.mongodb.demo.repository;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kthsoft.springdata.mongodb.demo.config.TestMongoDbConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestMongoDbConfig.class)
public class PaymentRepositoryTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
