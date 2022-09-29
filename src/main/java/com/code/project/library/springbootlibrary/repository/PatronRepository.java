package com.ned.armstrong.library.springbootlibrary.repository;

import com.ned.armstrong.library.springbootlibrary.model.Patron;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PatronRepository extends CrudRepository<Patron, Integer> {
    List<Patron> findAll();
    Patron findByPatronId(Integer id);

}
