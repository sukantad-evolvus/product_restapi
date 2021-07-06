package com.evolvus.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/products")
	public List<Product> getAllProducts() {

		return (List<Product>) productService.getAllProducts();

	}

	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable Long id) {

		return productService.getProduct(id);

	}
	@PostMapping("/products")
	public Product saveProduct(@RequestBody Product product) {
		
		return	productService.saveProduct(product);
		}
	
	
	@PutMapping("/products/{id}")
	
	public Product updateProduct(@RequestBody Product product, @PathVariable Long id) {
		return productService.updateProduct(product, id);
	}

	@DeleteMapping("/products/{id}")
	
	public Product deleteProduct(@PathVariable Long id) {
		return  productService.deleteProduct(id);
	}
}
