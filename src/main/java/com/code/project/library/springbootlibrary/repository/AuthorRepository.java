package com.ned.armstrong.library.springbootlibrary.repository;

import com.ned.armstrong.library.springbootlibrary.model.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

    List<Author> findAll();
    Author findByAuthorId(Integer id);

}
