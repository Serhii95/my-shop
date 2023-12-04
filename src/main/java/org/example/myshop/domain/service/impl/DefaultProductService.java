package org.example.myshop.domain.service.impl;

import org.example.myshop.domain.dto.ProductDTO;
import org.example.myshop.domain.service.ProductService;
import org.example.myshop.persistence.entity.Product;
import org.example.myshop.persistence.repository.ProductRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
@Transactional
public class DefaultProductService implements ProductService {

	private final ProductRepository productRepository;

	public DefaultProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public ProductDTO createProduct(ProductDTO productDTO) {
		Product product = new Product(productDTO);

		return new ProductDTO(productRepository.save(product));
	}

	@Override
	public Optional<ProductDTO> getProductById(int id) {
		return productRepository.findById(id).map(product -> new ProductDTO(product));
	}

	@Override
	public List<ProductDTO> getAllProducts() {
		return productRepository.findAll().stream().map(product -> new ProductDTO(product)).collect(Collectors.toList());
	}

	@Override
	public void deleteProduct(int id) {
		productRepository.deleteById(id);
	}
}
