package com.example.Spring.Boot.Lab.Group5_thihonggam.DAO;

import com.example.Spring.Boot.Lab.Group5_thihonggam.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class BookDAO {

    @Autowired
    private BookRepository repository;
    public Collection<Book> getBooks() {
        return repository.findAll();
    }

    public Book creatBook(Book book){
        return repository.insert(book);
    }
}
