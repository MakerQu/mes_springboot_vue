package com.crud_demo.service;

import com.crud_demo.dao.SupplierDao;
import com.crud_demo.entities.Supplier;
import com.crud_demo.mapper.SupplierMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    SupplierDao supplierDao;

    public List<Supplier> getAllSups(){
        return supplierDao.findAll();
        //return supplierDao.getAllSups();
    }

    //添加信息
    public void addSup(Supplier supplier){
        supplierDao.save(supplier);
    }

    //删除信息
    public void deleteById(Integer id){
        supplierDao.deleteById(id);
    }

    //查找某条信息
    public Supplier getSupById(Integer id){
        return supplierDao.getOne(id);
    }

    //修改信息
    public void editSup(Supplier supplier){

        supplierDao.save(supplier);
    }

    //查找某一分类中的所有消息
    public List<Supplier> getByCategory(Integer cat){
        return supplierDao.findAllBySupplier_category_idEquals(cat);
    }

    //分页查询所有数据
    public Page<Supplier> getAllSupsPage(Pageable pageable){
        return supplierDao.findAll(pageable);
    }

    //查询名称
    public List<Supplier> findBySupplier_nameContaining(String name){

        return supplierDao.findBySupplier_nameContaining(name);

    }

    //添加多条信息（Excel导入）
    public void addSuppliers(List<Supplier> suppliers) {
        Integer num = suppliers.size();
        for(Integer i=0 ; i<num ; i++){
            addSup(suppliers.get(i));
        }
    }




}
