package com.crud_demo.dao;

import com.crud_demo.entities.Production;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductionDao extends JpaRepository<Production,Integer> {


}
