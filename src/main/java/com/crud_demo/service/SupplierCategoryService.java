package com.crud_demo.service;

import com.crud_demo.dao.SupplierCategoryDao;
import com.crud_demo.entities.Machine;
import com.crud_demo.entities.SupplierCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierCategoryService {

    @Autowired
    SupplierCategoryDao supplierCategoryDao;

    public List<SupplierCategory> getAllSC(){
        return supplierCategoryDao.findAll();
    }

}
