package org.example.myshop.controller;

import org.example.myshop.domain.dto.CategoryDTO;
import org.example.myshop.domain.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/categories")
public class CategoryController {
	private final CategoryService categoryService;

	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@GetMapping
	public String showAll(Model model) {
		model.addAttribute("categories", categoryService.getAllCategories());
		return "categories/index";
	}

	@GetMapping("/{id}")
	public String getCategory(@PathVariable int id, Model model) {
		model.addAttribute("category", categoryService.getCategoryById(id));
		return "categories/show";
	}

	@GetMapping("/new")
	public String showCreateCategoryView(Model model) {
		model.addAttribute("category", new CategoryDTO());
		return "categories/new";
	}

	@PostMapping
	public String createCategory(@ModelAttribute CategoryDTO category) {
		categoryService.createCategory(category);
		return "redirect:/categories";
	}
}
