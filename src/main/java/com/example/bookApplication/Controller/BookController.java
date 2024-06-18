package com.example.bookApplication.Controller;

import com.example.bookApplication.Entity.Book;
import com.example.bookApplication.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book/v1")
public class BookController {
    private final BookService bookService;
    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book savedBook = bookService.addBook(book);
        return ResponseEntity.ok(savedBook);
    }
    @GetMapping("/getBook/{bookName}")
    public ResponseEntity<Book> getBookByName(@PathVariable("bookName")String name){
        final Book bookByName = bookService.getBookByName(name);
        return ResponseEntity.ok(bookByName);
    }
    @PutMapping("/updateBook")
    public ResponseEntity<Book> UpdatedBook(@RequestBody Book book) {
        Book UpdatedBook = bookService.UpdatedBook(book);
        return ResponseEntity.ok(UpdatedBook);
    }
    @DeleteMapping("/deletebook/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable("id") Integer id) {
       bookService.deleteBook(id);
        return ResponseEntity.ok().build();
    }
}
