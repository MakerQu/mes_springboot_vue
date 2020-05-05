package com.crud_demo.entities;

import javax.persistence.*;

@Entity(name="u_supplier")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer supplier_id;
    public String supplier_code;
    public String supplier_code_private;
    public String supplier_name;
    public String supplier_abbreviation;
    public String contact;
    public String contact_position;
    public String contact_sex;
    public String contact_number;
    public String begin_arrears;
    public String bank;
    public String bank_number;
    public String company_phone;
    public String fax;
    public String email;
    public String zip_code;
    public String qq_number;
    public String remarks;
    public Integer status;
    public Integer companyID;
    public Integer supplier_category_id;
    public String wechat_number;
    public String contact_address;

    @Override
    public String toString() {
        return "Supplier{" +
                "supplier_id=" + supplier_id +
                ", supplier_code='" + supplier_code + '\'' +
                ", supplier_code_private='" + supplier_code_private + '\'' +
                ", supplier_name='" + supplier_name + '\'' +
                ", supplier_abbreviation='" + supplier_abbreviation + '\'' +
                ", contact='" + contact + '\'' +
                ", contact_position='" + contact_position + '\'' +
                ", contact_sex='" + contact_sex + '\'' +
                ", contact_number='" + contact_number + '\'' +
                ", begin_arrears='" + begin_arrears + '\'' +
                ", bank='" + bank + '\'' +
                ", bank_number='" + bank_number + '\'' +
                ", company_phone='" + company_phone + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", zip_code='" + zip_code + '\'' +
                ", qq_number='" + qq_number + '\'' +
                ", remarks='" + remarks + '\'' +
                ", status=" + status +
                ", companyID=" + companyID +
                ", supplier_category_id=" + supplier_category_id +
                ", wechat_number='" + wechat_number + '\'' +
                ", contact_address='" + contact_address + '\'' +
                '}';
    }

    public String getWechat_number() {
        return wechat_number;
    }

    public void setWechat_number(String wechat_number) {
        this.wechat_number = wechat_number;
    }

    public String getContact_address() {
        return contact_address;
    }

    public void setContact_address(String contact_address) {
        this.contact_address = contact_address;
    }

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getSupplier_code() {
        return supplier_code;
    }

    public void setSupplier_code(String supplier_code) {
        this.supplier_code = supplier_code;
    }

    public String getSupplier_code_private() {
        return supplier_code_private;
    }

    public void setSupplier_code_private(String supplier_code_private) {
        this.supplier_code_private = supplier_code_private;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public String getSupplier_abbreviation() {
        return supplier_abbreviation;
    }

    public void setSupplier_abbreviation(String supplier_abbreviation) {
        this.supplier_abbreviation = supplier_abbreviation;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact_position() {
        return contact_position;
    }

    public void setContact_position(String contact_position) {
        this.contact_position = contact_position;
    }

    public String getContact_sex() {
        return contact_sex;
    }

    public void setContact_sex(String contact_sex) {
        this.contact_sex = contact_sex;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getBegin_arrears() {
        return begin_arrears;
    }

    public void setBegin_arrears(String begin_arrears) {
        this.begin_arrears = begin_arrears;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBank_number() {
        return bank_number;
    }

    public void setBank_number(String bank_number) {
        this.bank_number = bank_number;
    }

    public String getCompany_phone() {
        return company_phone;
    }

    public void setCompany_phone(String company_phone) {
        this.company_phone = company_phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getQq_number() {
        return qq_number;
    }

    public void setQq_number(String qq_number) {
        this.qq_number = qq_number;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public Integer getSupplier_category_id() {
        return supplier_category_id;
    }

    public void setSupplier_category_id(Integer supplier_category_id) {
        this.supplier_category_id = supplier_category_id;
    }
}
