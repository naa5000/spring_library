package com.ned.armstrong.library.springbootlibrary.resource;

import com.ned.armstrong.library.springbootlibrary.model.Section;
import com.ned.armstrong.library.springbootlibrary.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/sections")
public class SectionResource {

    @Autowired
    SectionRepository sectionRepository;

    @GetMapping(value = "/all")
    public List<Section> getAll() {
        return sectionRepository.findAll();
    }

    @PostMapping(value = "/save", consumes = {"application/json"})
    public List<Section> persist(@RequestBody final Section section){
        sectionRepository.save(section);
        return sectionRepository.findAll();
    }

    @GetMapping()
    public Section findById(@RequestParam Integer id){
        return sectionRepository.findBySectionId(id);
    }
}
