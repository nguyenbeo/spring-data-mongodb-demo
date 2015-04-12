package com.kthsoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kthsoft.springdata.mongodb.demo.repository.PaymentRepository;

@SpringBootApplication
public class App 
{
	@Autowired
	private PaymentRepository paymentRepository;
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
