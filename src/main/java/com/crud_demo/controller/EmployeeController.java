package com.crud_demo.controller;

import com.crud_demo.entities.Employee;
import com.crud_demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //查看所有列表
    @GetMapping("/emps")
    public String emps(Model model){
        System.out.println("emps已响应");
        Collection<Employee> employees = employeeService.getAllEmps();
        //Employee empById = employeeService.getEmpById(1);
        System.out.println("得到数据： "+ employees);
        model.addAttribute("emps",employees);
        return "list";
    }

    //编辑/查询某个员工
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id,Model model){
        System.out.println("emp/n已响应");
        Employee empById = employeeService.getEmpById(id);
        model.addAttribute("emp",empById);
        return "edit";
    }

    @PutMapping("/emp")
    public String saveEditEmp(Employee employee){
        System.out.println("saveEditEmp已响应");
        employeeService.updateEmpById(employee);
        return "redirect:/emps";
    }


    //添加页面
    @GetMapping("/emp")
    public String toEditPage(){
        System.out.println("emp已响应");
        return "add";
    }

    //保存员工信息
    @PostMapping("/emp")
    public String saveEmp(Employee employee){
        System.out.println("add已响应");
        employeeService.addEmp(employee);
        return "redirect:/emps";
    }

    //员工删除
    @GetMapping("/delete/{id}")
    public String deleteEmp(@PathVariable("id") Integer id){
        System.out.println("delete已响应");
        employeeService.deleteEmById(id);
        return "redirect:/emps";
    }











}
