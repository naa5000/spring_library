package com.ned.armstrong.library.springbootlibrary.repository;

import com.ned.armstrong.library.springbootlibrary.model.Section;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SectionRepository extends CrudRepository<Section, Integer> {

    List<Section> findAll();
    Section findBySectionId(Integer id);

}
