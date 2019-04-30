package com.smartshop.jwt.jwtsecurity.Model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name="Bill")
public class Bill
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Date Date;
    private Integer Amount;
    private Integer BillNo;
    private String Contact;
    private Time BillTime;

    public java.sql.Date getDate() {
        return Date;
    }

    public void setDate(java.sql.Date date) {
        Date = date;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

    public Integer getBillNo() {
        return BillNo;
    }

    public void setBillNo(Integer billNo) {
        BillNo = billNo;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public Time getBillTime() {
        return BillTime;
    }

    public void setBillTime(Time billTime) {
        BillTime = billTime;
    }
}
