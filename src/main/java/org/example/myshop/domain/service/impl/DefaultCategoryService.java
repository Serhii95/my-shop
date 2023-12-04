package org.example.myshop.domain.service.impl;

import org.example.myshop.domain.dto.CategoryDTO;
import org.example.myshop.domain.dto.UserDTO;
import org.example.myshop.domain.service.CategoryService;
import org.example.myshop.persistence.entity.Category;
import org.example.myshop.persistence.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class DefaultCategoryService implements CategoryService {

	private final CategoryRepository categoryRepository;

	public DefaultCategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public CategoryDTO createCategory(String categoryName) {
		return createCategory(new CategoryDTO(categoryName));
	}

	@Override
	public CategoryDTO createCategory(CategoryDTO categoryDTO) {
		Category category = new Category(categoryDTO);

		return  new CategoryDTO(categoryRepository.save(category));
	}

	@Override
	public Optional<CategoryDTO> getCategoryById(int id) {
		return categoryRepository.findById(id).map(category -> new CategoryDTO(category));
	}

	@Override
	public List<CategoryDTO> getAllCategories() {
		return categoryRepository.findAll().stream().map(category->new CategoryDTO(category)).collect(Collectors.toList());
	}

}
