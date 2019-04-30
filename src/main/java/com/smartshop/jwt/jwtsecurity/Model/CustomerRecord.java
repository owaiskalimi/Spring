package com.smartshop.jwt.jwtsecurity.Model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name="CustomerRecord")
public class CustomerRecord
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Date")
    private Date Date;
    @Column(name="Payment")
    private Integer Payment;
    @Column(name="Quantity")
    private Integer Quantity;
    @Column(name="Time")
    private Time Time;
    @Column(name="Contact")
    private String Contact;

    public java.sql.Date getDate() {
        return Date;
    }

    public void setDate(java.sql.Date date) {
        Date = date;
    }

    public Integer getPayment() {
        return Payment;
    }

    public void setPayment(Integer payment) {
        Payment = payment;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public java.sql.Time getTime() {
        return Time;
    }

    public void setTime(java.sql.Time time) {
        Time = time;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }


}
