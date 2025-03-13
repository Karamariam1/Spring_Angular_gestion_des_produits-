package com.universiapolis.gestion_produits.controller;

import com.universiapolis.gestion_produits.entity.Product;
import com.universiapolis.gestion_produits.metier.IProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universiapolis")
public class ProductController {

	@Autowired
	private IProduit ProductMetier;
	
	@PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return this.ProductMetier.addProduct(product);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
    	return this.ProductMetier.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return this.ProductMetier.getProductById(id);
    }

//    @GetMapping("/products/search")
//    public List<Product> searchProducts(@RequestParam String keyword) {
//        return this.ProductMetier.searchProducts(keyword);
//    }

    @PutMapping("/products/{id}")
    public Product updateProduct(@PathVariable("id") Long id, @RequestBody Product p) {
    	return  this.ProductMetier.updateProduct(id,p);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
        this.ProductMetier.deleteProduct(id);
    }
}
