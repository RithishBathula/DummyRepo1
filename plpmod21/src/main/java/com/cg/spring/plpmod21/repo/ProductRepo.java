package com.cg.spring.plpmod21.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.plpmod21.beans.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

}
