package org.example.myshop.domain.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.myshop.model.OrderData;
import org.example.myshop.model.ProductData;
import org.example.myshop.model.Status;
import org.example.myshop.model.UserData;

import java.util.List;
import java.util.stream.Collectors;

@Data
@EqualsAndHashCode(callSuper = true)
public class OrderDTO extends OrderData {
	private Integer id;
//	private Integer userId;
	private Status status;
	private Integer totalPrice;
	private UserDTO user;
	private List<ProductDTO> products;

	public OrderDTO(OrderData orderData) {
		super(orderData);
	}

	@Override
	public void setUser(UserData user) {
		this.user = (null == user) ? null : new UserDTO(user);
	}

	@Override
	public void setProducts(List<? extends ProductData> products) {
		this.products = (null == products) ? null : products.stream().map(ProductDTO::new).collect(Collectors.toList());
	}
}
