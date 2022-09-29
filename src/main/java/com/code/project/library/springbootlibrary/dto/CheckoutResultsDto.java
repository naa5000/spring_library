package com.ned.armstrong.library.springbootlibrary.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class CheckoutResultsDto {
    private Long id;
    private String title;
    private String author;
    private String section;
    private String location;
    private String deweyDecimal;
    private String status;
    private LocalDate dueDate;
}