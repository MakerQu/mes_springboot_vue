package com.crud_demo.controller;

import com.crud_demo.entities.Employee;
import com.crud_demo.entities.Machine;
import com.crud_demo.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class MachineController {

    @Autowired
    MachineService machineService;

    @GetMapping("/macs")
    public String mac(Model model){
        System.out.println("macs已响应");
        Collection<Machine> machines = machineService.getAllMac();
        System.out.println("得到数据：" + machines);
        model.addAttribute("macs",machines);
        return "/mac/list";
    }

    //转到添加页面
    @GetMapping("/mac")
    public String toAddPage(){
        return "/mac/add";
    }

    //保存设备信息
    @PostMapping("/mac")
    public String saveMac(Machine machine){
        int i = machineService.addMac(machine);
        return "redirect:/macs";
    }

    //转到编辑页面
    @GetMapping("/mac/{id}")
    public String toEditPage(@PathVariable("id")Integer id,Model model){
        Machine macById = machineService.getMacById(id);
        model.addAttribute("mac",macById);
        return "/mac/edit";
    }

    //保存编辑信息
    @PutMapping("/mac")
    public String saveEdit(Machine machine){
        machineService.updateMacById(machine);
        return "redirect:/macs";
    }

    //删除一条记录
    @GetMapping("/delete_mac/{id}")
    public String deleteMac(@PathVariable("id")Integer id){
        System.out.println("delete响应了");
        machineService.deleteMacById(id);
        return "redirect:/macs";
    }
}
