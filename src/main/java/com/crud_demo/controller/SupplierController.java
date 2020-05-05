package com.crud_demo.controller;
import com.crud_demo.component.ExceLIO;
import com.crud_demo.entities.Supplier;
import com.crud_demo.entities.SupplierCategory;
import com.crud_demo.service.SupplierCategoryService;
import com.crud_demo.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class SupplierController {

    @Autowired
    SupplierService supplierService;

    @Autowired
    SupplierCategoryService supplierCategoryService;

    //跳转到数据表单
    //返回json数据
    @GetMapping("/sups")
    public  List<Supplier> sups(){
        System.out.println("sups已响应");
        List<Supplier> allSups = supplierService.getAllSups();
        System.out.println("取得数据：" + allSups);
        return allSups;
    }

    //获取某一页的内容
    @GetMapping("/sups/{id}")
    public Page<Supplier>  sups2(@PathVariable("id") Integer id){
        System.out.println("sups/id已响应");
        PageRequest pageable = PageRequest.of(id, 10);//第几页,每页消息数量
        Page<Supplier> allSupsPage = supplierService.getAllSupsPage(pageable);
        return allSupsPage;
    }

    //查询目录信息
    @GetMapping("/supCats")
    @CrossOrigin(value = "http://localhost:8081"
            ,maxAge = 1800,allowedHeaders = "*")
    public List<SupplierCategory> supCats(){
        System.out.println("supCats已响应");
        List<SupplierCategory> allSCs = supplierCategoryService.getAllSC();
        System.out.println("得到数据： "+ allSCs);
        return allSCs;
    }

    //搜索功能 （按“名称”搜索）
    @GetMapping("/searchName/{name}")
    public List<Supplier> supsByName(@PathVariable("name") String name){
        System.out.println(name);
        List<Supplier> allSups = supplierService.findBySupplier_nameContaining(name);
        return allSups;
    }

    //按某一条件查找信息
    @GetMapping("/searchCat/{cat}")
    public List<Supplier> searchByCategory(@PathVariable("cat") Integer cat){
        System.out.println("/search/{cat}已响应");
        List<Supplier> allSCs = supplierService.getByCategory(cat);
        return allSCs;
    }

    //下载Excel请求
    @GetMapping("/ExportSup")
    public ResponseEntity<byte[]> exportSup(){
        return ExceLIO.supplier2Excel(supplierService.getAllSups());
    }

    //上传Excel请求
    @PostMapping("/ImportSup")
    public void importSup(MultipartFile file){
        if(file.isEmpty()){
            System.out.println("文件为空！");
            return;
        }
        System.out.println("ImportSup已响应");
        System.out.println("文件内容：" + file.getContentType());
        System.out.println("文件名称：" + file.getOriginalFilename());
        List<Supplier> suppliers = ExceLIO.excel2Supplier(file);
        System.out.println(suppliers);
        supplierService.addSuppliers(suppliers);
        System.out.println("ImportSup已Wancheng");
    }

    //修改“状态”  //弃用 JPA 自带 suppliers+id
    @PutMapping("/sups/{id}/status/{type}")
    public void editStatus(@PathVariable("id") Integer id,@PathVariable("type") Integer type){
    }

    //跳转到添加页面
    @GetMapping("/sup")
    public String toAddPage(Model model){
        System.out.println("emp已响应");
        List<SupplierCategory> allSCs = supplierCategoryService.getAllSC();
        System.out.println("得到数据： "+ allSCs);
        model.addAttribute("supCs",allSCs);
        return "/sup/add";
    }

    //“提交”后，保存数据
    @PostMapping("/sup")
    public String saveSup(Supplier supplier){
        System.out.println("输入数据：" + supplier);
        supplierService.addSup(supplier);
        System.out.println("存入数据库！");
        return "redirect:/sups";
    }


    //删除 某条记录
    @GetMapping("/deleteSup/{id}")
    public String deleteSup(@PathVariable("id") Integer id){
        System.out.println("delete已响应");
        supplierService.deleteById(id);
        return "redirect:/sups";
    }

    //编辑 某条记录
    @GetMapping("/editSup/{id}")
    public String toEditPage(@PathVariable("id") Integer id,Model model){
        System.out.println("sup/n已响应");
        Supplier supById = supplierService.getSupById(id);
        model.addAttribute("sup",supById);
        System.out.println("取得的编号："+ id);

        //传递selected需要的SCategory目录
        List<SupplierCategory> allSCs = supplierCategoryService.getAllSC();
        System.out.println("得到数据： "+ allSCs);
        model.addAttribute("supCs",allSCs);

        return "/sup/edit";
    }

    //保存编辑的信息
    @GetMapping("/editSup")
    public String toSaveEdit(Supplier supplier){
        System.out.println("editSup/n已响应");
        System.out.println("输入数据：" + supplier);
        supplierService.editSup(supplier);
        return "redirect:/sups";
    }










}
