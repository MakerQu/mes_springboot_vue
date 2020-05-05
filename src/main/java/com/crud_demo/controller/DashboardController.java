package com.crud_demo.controller;

import com.crud_demo.entities.SupplierCategory;
import com.crud_demo.service.ProductionService;
import com.crud_demo.service.SupplierCategoryService;
import com.crud_demo.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DashboardController {

    @Autowired
    ProductionService productionService;

    @Autowired
    SupplierCategoryService supplierCategoryService;

    @GetMapping("/dashboard")
    public String toDashboardPage(Model model){
        System.out.println("/dashboard 已被调用");
        //获取 供应商管理的目录数据
        List<SupplierCategory> allSCs = supplierCategoryService.getAllSC();
        model.addAttribute("supCs",allSCs);
        return "dashboard";
    }

    //Echarts图表获取数据
    @ResponseBody
    @GetMapping("/sys/echarts/line")
    public R echarts(){
        System.out.println("/sys/echarts/line 已被调用");
        return productionService.findLineData();
    }

    @ResponseBody
    @GetMapping("/sys/echarts/pie")
    public R echartspie(){
        System.out.println("/sys/echarts/pie 已被调用");
        return productionService.findLineData();
    }



}
