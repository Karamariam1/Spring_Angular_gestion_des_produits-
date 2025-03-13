package com.universiapolis.gestion_produits.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.websocket.server.ServerEndpoint;
import com.universiapolis.gestion_produits.repository.ProductRepository;
import com.universiapolis.gestion_produits.entity.Product;

@Service
public class IProductImpl implements IProduit{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product addProduct(Product product) {
        return productRepository.save(product);
    }

	@Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

	@Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

//	@Override
//    public List<Product> searchProducts(String Keyword) {
//        return productRepository.searchProducts(Keyword);
//    }

	@Override
    public Product updateProduct(Long id, Product productDetails) {
        Product product = getProductById(id);
        if (product != null) {
            product.setName(productDetails.getName());
            product.setDescription(productDetails.getDescription());
            product.setPrice(productDetails.getPrice());
            return productRepository.save(product);
        }
        return null;
    }

	@Override
    public void deleteProduct(Long id) {
		Product product=getProductById(id);
		if (product!=null) {
			
			this.productRepository.deleteById(id);
		}
		productRepository.deleteById(id);
    }

}



