package org.example.myshop.model;

import lombok.NoArgsConstructor;

import javax.persistence.criteria.CriteriaBuilder;

@NoArgsConstructor
public abstract class CategoryData {

	public CategoryData(CategoryData categoryData){
		setId(categoryData.getId());
		setTitle(categoryData.getTitle());
	}
	public abstract Integer getId();

	public abstract void setId(Integer id);

	public abstract String getTitle();

	public abstract void setTitle(String title);
}
