package com.crud_demo.service;

import com.crud_demo.dao.ProductionDao;
import com.crud_demo.entities.Production;
import com.crud_demo.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ProductionService {

    @Autowired
    ProductionDao productionDao;

    public List<Production> getAllPro(){
        return productionDao.findAll();
    }

    public R findLineData(){
        List<Production> pros = productionDao.findAll();

        List xAxisData = new ArrayList();
        List seriesAxisData = new ArrayList();

        for(Production pro:pros){
            xAxisData.add(pro.getDate());
            seriesAxisData.add(pro.getProduction());
        }
        System.out.println("xAxisData:" + xAxisData);
        System.out.println("seriesAxisData:" + seriesAxisData);

        return R.ok().put("xAxis",xAxisData).put("seriesData",seriesAxisData);

    }
}