package org.example.myshop.domain.service;

import org.example.myshop.domain.dto.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface ProductService {

	ProductDTO createProduct(ProductDTO product);

	Optional<ProductDTO> getProductById(int id);

	List<ProductDTO> getAllProducts();

	void deleteProduct(int id);
}
