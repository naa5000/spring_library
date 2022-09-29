package com.ned.armstrong.library.springbootlibrary.resource;

import com.ned.armstrong.library.springbootlibrary.model.Author;
import com.ned.armstrong.library.springbootlibrary.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/authors")
public class AuthorResource {

    @Autowired
    AuthorRepository authorRepository;

    @GetMapping(value = "/all")
    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    @PostMapping(value = "/save")
    public List<Author> persist(@RequestBody final Author author){
        authorRepository.save(author);
        return authorRepository.findAll();
    }

    @GetMapping()
    public Author findById(@RequestParam Integer id){
        return authorRepository.findByAuthorId(id);
    }
}
