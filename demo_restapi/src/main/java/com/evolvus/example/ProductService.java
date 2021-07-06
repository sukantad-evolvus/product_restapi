package com.evolvus.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService{

@Autowired
ProductRepository productRepository;

public List<Product> getAllProducts() {
	
  return  (List<Product>) productRepository.findAll();
  
}

public Product getProduct(Long id) {
	
return	productRepository.findById(id).get();
	
}

public Product saveProduct(Product product) {
	
return	productRepository.save(product);
}

public Product updateProduct(Product product,Long id) {
	
 Product existingProduct=	productRepository.findById(id).get();
         
 existingProduct.setId(product.getId());
 existingProduct.setName(product.getName());
 existingProduct.setPrice(product.getPrice());
 
return productRepository.save(existingProduct);
 
}

public Product deleteProduct(Long id) {

Product deletingProduct=productRepository.findById(id).get();

productRepository.delete(deletingProduct);

return deletingProduct;
}

}

