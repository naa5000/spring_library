package com.ned.armstrong.library.springbootlibrary.resource;

import com.ned.armstrong.library.springbootlibrary.model.Book;
import com.ned.armstrong.library.springbootlibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/books")
public class BookResource {

    @Autowired
    BookRepository bookRepository;

    @GetMapping(value = "/all")
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @PostMapping(value = "/save")
    public List<Book> persist(@RequestBody final Book book){
        bookRepository.save(book);
        return bookRepository.findAll();
    }

    @GetMapping()
    public Book findById(@RequestParam Integer id){
        return bookRepository.findById(id).get();
    }

}
