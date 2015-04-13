package com.kthsoft.springdata.mongodb.demo.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kthsoft.springdata.mongodb.demo.config.EmbededMongoDbConfig;
import com.kthsoft.springdata.mongodb.demo.model.Payment;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EmbededMongoDbConfig.class)
public class PaymentRepositoryTest {
	
	private static final String PAYMENT_REFERENCE = "93933939326ndhddga827227";
	private static final String CURRENCY = "SEK";
	private static final BigDecimal AMOUNT = new BigDecimal(10.0);
	
	@Autowired
	private PaymentRepository paymentRepository;

	@Test
	public void testAutowiredRepository() {
		assertNotNull(paymentRepository);
	}
	
	@Test
	public void testSavePayment() {
		// Given
		Payment payment = createPayment();
		
		// When
		paymentRepository.save(payment);
		
		// Then
		Payment rereadPayment = paymentRepository.findByPaymentReference(PAYMENT_REFERENCE);
		assertEquals(rereadPayment.getPaymentReference(), PAYMENT_REFERENCE);
		assertEquals(rereadPayment.getAmount(), AMOUNT);
		assertEquals(rereadPayment.getCurrency(), CURRENCY);
	}
	
	private Payment createPayment() {
		Payment payment = new Payment();
		payment.setAmount(AMOUNT);
		payment.setCurrency(CURRENCY);
		payment.setPaymentReference(PAYMENT_REFERENCE);
		return payment;
	}

}