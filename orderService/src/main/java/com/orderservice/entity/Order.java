package com.orderservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Order  {
	
	@Id  
	private int orderId;
	
	@Column
	private String CustomerName;
	@Column
	private String OrderDate;
	@Column
	private String ShippingAddress;
	@Column
	private  OrderItems  orderItems;
	
	@Column
	private String Total;
	
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}
	public String getShippingAddress() {
		return ShippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		ShippingAddress = shippingAddress;
	}
	
	public String getTotal() {
		return Total;
	}
	public void setTotal(String total) {
		Total = total;
	}
	

	public OrderItems getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(OrderItems orderItems) {
		this.orderItems = orderItems;
	}
	@Override
	public String toString() {
		return "Order [CustomerName=" + CustomerName + ", OrderDate=" + OrderDate + ", ShippingAddress="
				+ ShippingAddress + ", OrderItems=" + orderItems + ", Total=" + Total + "]";
	}
	
	
	

}
