package com.orderservice.model;

import java.io.Serializable;

public class Order implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7583984680358383940L;
	
	
	private String CustomerName;
	private String OrderDate;
	private String ShippingAddress;
	private  OrderItems  orderItems;
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
