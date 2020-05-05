package com.crud_demo.dao;

import com.crud_demo.entities.SupplierCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierCategoryDao extends JpaRepository<SupplierCategory,Integer> {

}
