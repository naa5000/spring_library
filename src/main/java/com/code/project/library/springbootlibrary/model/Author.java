package com.ned.armstrong.library.springbootlibrary.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Author {
    @Id
    @GeneratedValue
    @Column(name = "author_id")
    private Integer authorId;

    @Column(name = "name")
    private String name;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "gender")
    private String gender;
}
