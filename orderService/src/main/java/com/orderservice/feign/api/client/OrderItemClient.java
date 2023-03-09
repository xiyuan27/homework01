package com.orderservice.feign.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.orderservice.model.OrderItems;


@FeignClient(url="http://localhost:8080/orderitem",name="ORDER-ITEM-SERVICE")
public interface OrderItemClient {

	@PostMapping
	public void createOrderItem();
	
	@GetMapping
	public OrderItems retrievingOrderItem(String id);
	
}

