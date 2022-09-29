package com.ned.armstrong.library.springbootlibrary.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Section {
    @Id
    @GeneratedValue

    @Column(name = "section_id")
    private Integer sectionId;

    @Column(name = "section_name")
    private String sectionName;

    @Column(name = "location")
    private String location;
}
