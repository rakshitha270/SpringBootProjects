package com.example.bookApplication.Repository;

import com.example.bookApplication.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

   public Book findBookByTitle(String Title);
}
