package org.example.myshop.model;

import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public abstract class OrderData {

	public OrderData(OrderData orderData) {
		setId(orderData.getId());
//		setUserId(orderData.getUserId());
		setStatus(orderData.getStatus());
		setTotalPrice(orderData.getTotalPrice());
		setUser(orderData.getUser());
		setProducts(orderData.getProducts());
	}

	public abstract Integer getId();

	public abstract void setId(Integer id);

//	public abstract Integer getUserId();

//	public abstract void setUserId(Integer userId);

	public abstract Status getStatus();

	public abstract void setStatus(Status status);

	public abstract Integer getTotalPrice();

	public abstract void setTotalPrice(Integer totalPrice);

	public abstract UserData getUser();

	public abstract void setUser(UserData user);

	public abstract List<? extends ProductData> getProducts();

	public abstract void setProducts(List<? extends ProductData> products);

}
