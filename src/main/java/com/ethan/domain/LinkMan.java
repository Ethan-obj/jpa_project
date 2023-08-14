package com.ethan.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "cst_linkman")
public class LinkMan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name = "lkm_id")
    private Long lkmId;
    // @Column(name = "lkm_name")
    private String lkmName;
    // @Column(name = "lkm_gender")
    private String lkmGender;
    // @Column(name = "lkm_phone")
    private String lkmPhone;
    // @Column(name = "lkm_mobile")
    private String lkmMobile;
    // @Column(name = "lkm_email")
    private String lkmEmail;
    // @Column(name = "lkm_position")
    private String lkmPosition;
    // @Column(name = "lkm_memo")
    private String lkmMemo;
    @Column(insertable = false, updatable = false)
    private Long lkmCustId;


    @ManyToOne(targetEntity = Customer.class)
    @JoinColumn(name = "lkmCustId", referencedColumnName = "custId")
    private Customer customer;

    @Override
    public String toString() {
        return "LinkMan{" +
                "lkmId=" + lkmId +
                ", lkmName='" + lkmName + '\'' +
                ", lkmGender='" + lkmGender + '\'' +
                ", lkmPhone='" + lkmPhone + '\'' +
                ", lkmMobile='" + lkmMobile + '\'' +
                ", lkmEmail='" + lkmEmail + '\'' +
                ", lkmPosition='" + lkmPosition + '\'' +
                ", lkmMemo='" + lkmMemo + '\'' +
                ", lkmCustId='" + lkmCustId + '\'' +
                '}';
    }
}
