package com.kaah.maison.erp.repositories;

import com.kaah.maison.erp.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}