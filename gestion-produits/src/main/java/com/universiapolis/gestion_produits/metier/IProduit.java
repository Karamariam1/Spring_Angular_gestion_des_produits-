package com.universiapolis.gestion_produits.metier;

import com.universiapolis.gestion_produits.entity.Product;
import java.util.List;

public interface IProduit {

	public Product addProduct(Product product);
	public List<Product> getAllProducts();
	public Product getProductById(Long id) ;
	//public List<Product> searchProducts(String Keyword);
	public Product updateProduct(Long id, Product productDetails);
	public void deleteProduct(Long id) ;
}
