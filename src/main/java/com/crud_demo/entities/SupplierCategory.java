package com.crud_demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;

@Entity(name="u_supplier_category")
public class SupplierCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer supplier_category_id;
    private Integer parent_id;
    private String supplier_category_name;
    private String remarks;
    private Integer level;
    private Integer companyID;

    @Override
    public String toString() {
        return "SupplierCategory{" +
                "supplier_category_id=" + supplier_category_id +
                ", parent_id=" + parent_id +
                ", supplier_category_name='" + supplier_category_name + '\'' +
                ", remarks='" + remarks + '\'' +
                ", level=" + level +
                ", companyID=" + companyID +
                '}';
    }

    public Integer getSupplier_category_id() {
        return supplier_category_id;
    }

    public void setSupplier_category_id(Integer supplier_category_id) {
        this.supplier_category_id = supplier_category_id;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public String getSupplier_category_name() {
        return supplier_category_name;
    }

    public void setSupplier_category_name(String supplier_category_name) {
        this.supplier_category_name = supplier_category_name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }
}
