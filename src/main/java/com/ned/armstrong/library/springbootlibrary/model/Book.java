package com.ned.armstrong.library.springbootlibrary.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "author_id")
    private Integer authorId;

    @Column(name = "section_id")
    private Integer sectionId;

    @Column(name = "title")
    private String title;

    @Column(name = "dewey_decimal")
    private String deweyDecimal;
}
