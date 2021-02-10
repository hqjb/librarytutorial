package com.reku.tutoriallibrary.controller;

import com.reku.tutorial_library.api.LibraryApi;
import com.reku.tutorial_library.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryController implements LibraryApi {

    @Override
    public ResponseEntity<List<Book>> getAllBooksInLibrary() {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book();
        book1.setName("Harry Potter");
        book1.setBookAuthor("JK Rowling");

        Book book2 = new Book();
        book2.setName("Chronicles of Narnia");
        book2.setBookAuthor("CS Lewis");

        books.add(book1);
        books.add(book2);

        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
