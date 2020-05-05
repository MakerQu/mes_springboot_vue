package com.crud_demo.mapper;

import com.crud_demo.entities.Employee;
import com.crud_demo.entities.Machine;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MachineMapper {

    int addMac(Machine machine);
    int deleteMacById(Integer id);
    int updateMacById(Machine machine);
    Machine getMacById(Integer id);
    List<Machine> getAllMac();

}
