package com.example.Spring.Boot.Lab.Group5_thihonggam.controller;

import com.example.Spring.Boot.Lab.Group5_thihonggam.entity.Book;
import com.example.Spring.Boot.Lab.Group5_thihonggam.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

//    @GetMapping
//    public String getBooks() {
//        return "hello world";
//    }


    @GetMapping
    public Collection<Book> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping()
    public Book postBook(@RequestBody Book book){
        return bookService.createBook(book);
    }





}
