package com.via.greeninstalators.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@IdClass(CompanyInfo.class)
@Table(name = "companyinfo")
public class CompanyInfo implements Serializable {

    @Id
    @Column(name = "company_code")
    private String companyCode;

    private String name;
    private String country;
    private String postal_code;
    private double price_per_distance_unit;
    private String email

    //default constructor for JPA
    public CompanyInfo() {}

    public CompanyInfo(String companyCode, Sting email, String name, String country, String postal_code, double price_per_distance_unit) {
        this.companyCode = companyCode;
        this.name = name;
        this.email = email
        this.country = country;
        this.postal_code = postal_code;
        this.price_per_distance_unit = price_per_distance_unit;
    }

    public void setCompanyCode(String companyCode)
    {
        this.companyCode = companyCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public String getName() {
        return name;
    }

     public String email() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public String getPostalCode() {
        return postal_code;
    }

    public double getPricePerDistanceUnit() {
        return price_per_distance_unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyInfo that = (CompanyInfo) o;
        return Objects.equals(companyCode, that.companyCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyCode);
    }
}
