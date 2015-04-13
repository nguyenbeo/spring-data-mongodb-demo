package com.kthsoft.springdata.mongodb.demo.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

public class Payment {
	@Id
	private String id;
	private String paymentReference;
	private BigDecimal amount;
	private String currency;
	
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getPaymentReference() {
		return paymentReference;
	}
	public void setPaymentReference(String paymentReference) {
		this.paymentReference = paymentReference;
	}
	
	
}
