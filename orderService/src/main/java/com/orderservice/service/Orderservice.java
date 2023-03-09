package com.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.orderservice.entity.Order;
import com.orderservice.repo.OrderserviceRepository;

@Component
public class Orderservice {
	
	@Autowired
	OrderserviceRepository orderserviceRepository;
	
	
	public void createorderes(Order order) {
		orderserviceRepository.save(order);
    }

}
