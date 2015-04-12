package com.kthsoft.springdata.mongodb.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kthsoft.springdata.mongodb.demo.model.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String> {
	Payment findByPaymentReference(String paymentReference);
}
