package com.dannyc12.ecommerce.dao;

import com.dannyc12.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

// CrossOrigin support needs to be to properly display products in the angular project (accepts calls from web browser
// scripts from specified origin
// JpaRepository<entity type, primary key type>
@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Step 6) Modify Spring Boot App - REST repository needs new method to return only products for a given categoryId
    // Spring will execute a SQL query like "SELECT * FROM product where category_id=?" and automatically expose the
    // endpoint
    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);

    Page<Product> findByNameContaining(@Param("name") String name, Pageable pageable);
}
