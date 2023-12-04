package org.example.myshop.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.myshop.model.OrderData;
import org.example.myshop.model.ProductData;
import org.example.myshop.model.Status;
import org.example.myshop.model.UserData;

import javax.persistence.*;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Data
@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Order extends OrderData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

//	@Column(name = "user_id")
//	private Integer userId;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false, unique = true)
	private Status status;

	@Column(name = "total_price", nullable = false)
	private Integer totalPrice;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToMany
	@JoinTable(
			name = "orders_products",
			joinColumns = @JoinColumn(name = "order_id"),
			inverseJoinColumns = @JoinColumn(name = "product_id"))
	private List<Product> products;

	@Override
	public void setUser(UserData user) {
		this.user = (user == null) ? null : new User(user);
	}

	@Override
	public void setProducts(List<? extends ProductData> products) {
		this.products = (null == products) ? null : products.stream().map(Product::new).collect(toList());
	}
}
