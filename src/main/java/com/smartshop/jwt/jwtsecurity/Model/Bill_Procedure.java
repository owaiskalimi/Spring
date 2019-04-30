package com.smartshop.jwt.jwtsecurity.Model;

import javax.persistence.*;

@Entity
@Table(name="Bill_Procedure")
public class Bill_Procedure
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String pyprocess;
    private Integer BillNo;

    public String getPyprocess() {
        return pyprocess;
    }

    public void setPyprocess(String pyprocess) {
        this.pyprocess = pyprocess;
    }

    public Integer getBillNo() {
        return BillNo;
    }

    public void setBillNo(Integer billNo) {
        BillNo = billNo;
    }
}
