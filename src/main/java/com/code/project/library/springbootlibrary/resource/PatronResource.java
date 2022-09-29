package com.ned.armstrong.library.springbootlibrary.resource;

import com.ned.armstrong.library.springbootlibrary.model.Patron;
import com.ned.armstrong.library.springbootlibrary.repository.PatronRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/patrons")
public class PatronResource {

    @Autowired
    PatronRepository patronRepository;

    @GetMapping(value = "/all")
    public List<Patron> getAll() {
        return patronRepository.findAll();
    }

    @PostMapping(value = "/save")
    public List<Patron> persist(@RequestBody final Patron patron){
        patronRepository.save(patron);
        return patronRepository.findAll();
    }

    @GetMapping()
    public Patron findById(@RequestParam Integer id){
        return patronRepository.findByPatronId(id);
    }
}
