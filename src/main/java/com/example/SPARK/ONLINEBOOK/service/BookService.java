package com.example.SPARK.ONLINEBOOK.service;

import com.example.SPARK.ONLINEBOOK.dal.BookModelRepo;
import com.example.SPARK.ONLINEBOOK.model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookModelRepo bmr;

    public Optional<BookModel> getBookTitle(String title){
        return bmr.findByTitle(title);
    }

    public BookModel createBookService(BookModel bms){
        return bmr.save(bms);
    }

}
