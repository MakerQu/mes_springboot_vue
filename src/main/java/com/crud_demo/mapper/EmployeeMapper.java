package com.crud_demo.mapper;

import com.crud_demo.entities.Employee;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface EmployeeMapper {

    int addEmp(Employee employee);
    int deleteEmById(Integer id);
    int updateEmpById(Employee employee);
    Employee getEmpById(Integer id);
    List<Employee> getAllEmps();
}
