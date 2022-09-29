package com.ned.armstrong.library.springbootlibrary.repository;

import com.ned.armstrong.library.springbootlibrary.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Integer> {

    List<Book> findAll();

}
