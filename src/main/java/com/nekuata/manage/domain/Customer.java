package com.nekuata.manage.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Customer {
    public Customer() {

    }

    @Id
    @GeneratedValue
    private Long id;

    @Size(min=1, max=100)
    private String name;

    @Size(min=1, max=100)
    private String site;

    @Size(min=1, max=100)
    private String email;

    @Size(min=1, max=15)
    private String phone;

    @Size(min=1, max=25)
    private String tax;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }
}