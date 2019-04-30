package com.smartshop.jwt.jwtsecurity.Model;

import javax.persistence.*;

@Entity
@Table(name="Customer")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Name")
    private String Name;
    @Column(name="Contact")
    private String Contact;
    @Column(name="Address")
    private String Address;
    @Column(name="Password")
    private String Password;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
