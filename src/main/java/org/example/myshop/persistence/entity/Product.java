package org.example.myshop.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.myshop.model.CategoryData;
import org.example.myshop.model.ProductData;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Product extends ProductData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private Double price;

	private boolean available;

	@Column(nullable = false)
	private Integer amount;

	private Integer discount;

	@Column(nullable = false)
	private String description;

	@Column(nullable = false)
	private String characteristic;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	public Product(ProductData productData) {
		super(productData);
	}

	@Override
	public void setCategory(CategoryData category) {
		this.category = (null == category) ? null : new Category(category);
	}

//	@ManyToMany
//	@JoinTable(
//			name = "orders_products",
//			joinColumns = @JoinColumn(name = "product_id"),
//			inverseJoinColumns = @JoinColumn(name = "order_id"))
//	private List<Order> orders;


}
