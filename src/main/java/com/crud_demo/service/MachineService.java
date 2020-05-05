package com.crud_demo.service;

import com.crud_demo.entities.Machine;
import com.crud_demo.mapper.MachineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MachineService {

    @Autowired
    MachineMapper machineMapper;

    public int addMac(Machine machine){
        return machineMapper.addMac(machine);
    }

    public int deleteMacById(Integer id){
        return machineMapper.deleteMacById(id);
    }

    public int updateMacById(Machine machine){
        return machineMapper.updateMacById(machine);
    }

    public Machine getMacById(Integer id){
        return machineMapper.getMacById(id);
    }

    public List<Machine> getAllMac(){
        return machineMapper.getAllMac();
    }


}
