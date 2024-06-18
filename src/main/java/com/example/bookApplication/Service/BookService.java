package com.example.bookApplication.Service;

import com.example.bookApplication.Entity.Book;
import com.example.bookApplication.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
     BookRepository bookRepository;

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book getBookByName(String name) {
        return bookRepository.findBookByTitle(name);
    }

    public Book UpdatedBook(Book book) {
        return bookRepository.save(book);
    }
    public void  deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }
}
