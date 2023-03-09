package com.orderservice.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.orderservice.entity.Order;

@Repository
public interface OrderserviceRepository extends CrudRepository<Order, Long> {}
	
