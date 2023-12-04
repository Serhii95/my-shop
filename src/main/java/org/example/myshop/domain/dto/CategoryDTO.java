package org.example.myshop.domain.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.myshop.model.CategoryData;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CategoryDTO extends CategoryData {
	private Integer id;
	private String title;

	public CategoryDTO(String title) {
		this.title = title;
	}

	public CategoryDTO(CategoryData categoryData) {
		super(categoryData);
	}
}
