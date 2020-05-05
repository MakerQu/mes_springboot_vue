package com.crud_demo.dao;

import com.crud_demo.entities.Supplier;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.awt.print.Pageable;
import java.util.List;


////自定义路径
//@RepositoryRestResource(path="sus",collectionResourceRel = "sus",itemResourceRel = "su")
//跨域支持
@CrossOrigin
public interface SupplierDao extends JpaRepository<Supplier, Integer> {

//    @Query(value = "select * from u_supplier",nativeQuery = true)
    //List<Supplier> getAllSups();
    List<Supplier> findAll();
//    <select id="getEmpById" parameterType="int" resultType="com.crud_demo.entities.Employee">
//    SELECT * FROM myuser WHERE id=#{id}
//    </select>

//    @Query(value = "select * from u_supplier",nativeQuery = true)
//
    @Query("select b from u_supplier b where b.supplier_category_id=:id")
    List<Supplier> findAllBySupplier_category_idEquals(Integer id);


    //为什么去掉Query后失效了？
    @Query(value = "select * from u_supplier where supplier_name like %:name% ",nativeQuery = true)
    List<Supplier> findBySupplier_nameContaining(String name);

//    @RestResource(path="contact",rel = "contact")
//    List<Supplier> findByContactContains(@Param("contact") String contact);

//    //添加数据集
//    Integer addSups(@Param("list") List<Supplier> list);

}
