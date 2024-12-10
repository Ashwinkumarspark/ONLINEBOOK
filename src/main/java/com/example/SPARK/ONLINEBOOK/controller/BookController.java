package com.example.SPARK.ONLINEBOOK.controller;

import com.example.SPARK.ONLINEBOOK.model.BookModel;
import com.example.SPARK.ONLINEBOOK.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RequestMapping("/books")
@RestController
public class BookController {

    @Autowired
    private BookService bs;

    @GetMapping("/get/{title}")
    public Optional<BookModel> getBookcontroller(@PathVariable String title){
        return bs.getBookTitle(title);
    }

    @PostMapping("/post")
    public BookModel createBooks(@RequestBody BookModel bm){
        return bs.createBookService(bm);
    }
}
