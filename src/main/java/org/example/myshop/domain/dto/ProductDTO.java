package org.example.myshop.domain.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.myshop.model.CategoryData;
import org.example.myshop.model.ProductData;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ProductDTO extends ProductData {

	private Integer id;
	private String title;
	private Double price;
	private boolean available;
	private Integer amount;
	private Integer discount;
	private String description;
	private String characteristic;
	private CategoryDTO category;

	public ProductDTO(ProductData productData) {
		super(productData);
	}

	@Override
	public void setCategory(CategoryData category) {
		this.category = (null == category) ? null : new CategoryDTO(category);
	}
}
