package com.crud_demo.mapper;

import com.crud_demo.entities.Supplier;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SupplierMapper {

    List<Supplier> getAllSups();

//    Integer addSups(@Param("list") List<Supplier> list);

}
