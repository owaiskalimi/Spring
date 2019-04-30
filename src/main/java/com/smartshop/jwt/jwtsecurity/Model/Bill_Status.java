package com.smartshop.jwt.jwtsecurity.Model;

import javax.persistence.*;

@Entity
@Table(name="Bill_Status")
public class Bill_Status
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Status;
    private Integer BillNo;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Integer getBillNo() {
        return BillNo;
    }

    public void setBillNo(Integer billNo) {
        BillNo = billNo;
    }
}
