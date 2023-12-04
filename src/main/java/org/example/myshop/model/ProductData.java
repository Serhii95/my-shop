package org.example.myshop.model;

import lombok.NoArgsConstructor;
import org.example.myshop.persistence.entity.Category;

@NoArgsConstructor
public abstract class ProductData {

	public ProductData(ProductData productData) {
		setId(productData.getId());
		setTitle(productData.getTitle());
		setPrice(productData.getPrice());
		setAvailable(productData.isAvailable());
		setAmount(productData.getAmount());
		setDiscount(productData.getDiscount());
		setDescription(productData.getDescription());
		setCharacteristic(productData.getCharacteristic());
		setCategory(productData.getCategory());

	}

	public abstract Integer getId();

	public abstract void setId(Integer id);

	public abstract String getTitle();

	public abstract void setTitle(String title);

	public abstract Double getPrice();

	public abstract void setPrice(Double price);

	public abstract boolean isAvailable();

	public abstract void setAvailable(boolean available);

	public abstract Integer getAmount();

	public abstract void setAmount(Integer amount);

	public abstract Integer getDiscount();

	public abstract void setDiscount(Integer discount);

	public abstract String getDescription();

	public abstract void setDescription(String description);

	public abstract String getCharacteristic();

	public abstract void setCharacteristic(String characteristic);

	public abstract CategoryData getCategory();

	public abstract void setCategory(CategoryData category);

}
