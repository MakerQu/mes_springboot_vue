package com.crud_demo.service;

import com.crud_demo.entities.Employee;
import com.crud_demo.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public int addEmp(Employee employee){
        return employeeMapper.addEmp(employee);
    }

    public int deleteEmById(Integer id){
        return employeeMapper.deleteEmById(id);
    }

    public int updateEmpById(Employee employee){
        return employeeMapper.updateEmpById(employee);
    }

    public Employee getEmpById(Integer id){
        return employeeMapper.getEmpById(id);
    }

    public List<Employee> getAllEmps(){
        return employeeMapper.getAllEmps();
    }

}
