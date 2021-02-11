package com.example.Spring.Boot.Lab.Group5_thihonggam.service;

import com.example.Spring.Boot.Lab.Group5_thihonggam.DAO.BookDAO;
import com.example.Spring.Boot.Lab.Group5_thihonggam.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookService {
   @Autowired
   private BookDAO bookDAO;

   public Collection<Book> getBooks() {
      return bookDAO.getBooks();
   }

   public Book createBook(Book book){
      return bookDAO.creatBook(book);
   }

}
