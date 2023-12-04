package org.example.myshop.domain.service;

import org.example.myshop.domain.dto.CategoryDTO;
import org.example.myshop.domain.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
	CategoryDTO createCategory(String categoryName);

	CategoryDTO createCategory(CategoryDTO categoryDTO);

	Optional<CategoryDTO> getCategoryById(int id);

	List<CategoryDTO> getAllCategories();
}
