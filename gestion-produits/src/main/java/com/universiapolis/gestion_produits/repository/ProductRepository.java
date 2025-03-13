package com.universiapolis.gestion_produits.repository;

import com.universiapolis.gestion_produits.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Component;
import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	//@Query("SELECT p FROM Product WHERE name LIKE %:keyword% OR p.description LIKE %:keyword%");
		//List<Product> searchProducts(String Keyword);
}
