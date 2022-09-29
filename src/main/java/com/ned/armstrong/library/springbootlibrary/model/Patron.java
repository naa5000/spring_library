package com.ned.armstrong.library.springbootlibrary.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Patron {
    @Id
    @GeneratedValue
    @Column(name = "patron_id")
    private Integer patronId;

    @Column(name = "patron_name")
    private String patronName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "zip_code")
    private Integer zipCode;
}
