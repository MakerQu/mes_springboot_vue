package com.crud_demo.entities;

public class Department {

    private Integer id;
    private String departmentName;

    //不太明白这一段的用意
//    public Department(int i, String string) {
//        this.id = i;
//        this.departmentName = string;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
