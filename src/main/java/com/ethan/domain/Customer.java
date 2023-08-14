package com.ethan.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "cst_customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name="cust_id")
    private Long custId;
    // @Column(name="cust_address")
    private String custAddress;
    // @Column(name="cust_industry")
    private String custIndustry;
    // @Column(name="cust_level")
    private String custLevel;
    // @Column(name="cust_name")
    private String custName;
    // @Column(name="cust_phone")
    private String custPhone;
    // @Column(name="cust_source")
    private String custSource;


    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<LinkMan> linkMans = new HashSet<>();

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custAddress='" + custAddress + '\'' +
                ", custIndustry='" + custIndustry + '\'' +
                ", custLevel='" + custLevel + '\'' +
                ", custName='" + custName + '\'' +
                ", custPhone='" + custPhone + '\'' +
                ", custSource='" + custSource + '\'' +
                '}';
    }
}
