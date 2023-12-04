package org.example.myshop.controller;

import org.example.myshop.domain.dto.ProductDTO;
import org.example.myshop.domain.service.CategoryService;
import org.example.myshop.domain.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductController {
	private final ProductService productService;
	private final CategoryService categoryService;

	public ProductController(ProductService productService,
	                         CategoryService categoryService) {
		this.productService = productService;
		this.categoryService = categoryService;
	}

	@GetMapping
	public String showAll(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "products/index";
	}

	@GetMapping("/{id}")
	public String getProduct(@PathVariable int id, Model model) {
		model.addAttribute("product", productService.getProductById(id));
		return "products/show";
	}

	@GetMapping("/new")
	public String showCreateProductView(Model model) {
		model.addAttribute("product", new ProductDTO());
		model.addAttribute("categories", categoryService.getAllCategories());
		return "products/new";
	}

	@PostMapping
	public String createProduct(@ModelAttribute ProductDTO product) {
		productService.createProduct(product);
		return "redirect:/products";
	}

	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable int id){
		productService.deleteProduct(id);
		return "redirect:/products";
	}
}
