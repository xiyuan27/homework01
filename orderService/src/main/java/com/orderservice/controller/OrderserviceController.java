package com.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderservice.feign.api.client.OrderItemClient;
import com.orderservice.model.OrderItems;
import com.orderservice.service.Orderservice;
import com.orderservice.entity.Order;

@RestController
@RequestMapping("/order")
public class OrderserviceController {

	@Autowired
	OrderItemClient orderItemClient;

	@Autowired
	Orderservice orderservice;

	@PostMapping("/createOrder")
	public void createOrderItem(@RequestBody Order order) {

		orderservice.createorderes(order);

	}

	public OrderItems retrievingExistingOrderItem(String id) {
		OrderItems orderItems = orderItemClient.retrievingOrderItem(id);
		return orderItems;

	}

}
