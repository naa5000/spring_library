package com.ned.armstrong.library.springbootlibrary.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class CheckOut {
    @Id
    @GeneratedValue
    @Column(name = "checkout_id")
    private Integer checkoutId;

    @Column(name = "patron_id")
    private Integer patronId;

    @Column(name = "book_id")
    private Integer bookId;

    @Column(name = "check_out_date")
    private LocalDate checkOutDate;

    @Column(name = "due_date")
    private LocalDate dueDate;
}
