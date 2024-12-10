package com.example.SPARK.ONLINEBOOK.dal;

import com.example.SPARK.ONLINEBOOK.model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookModelRepo extends MongoRepository<BookModel, String> {

    public Optional<BookModel> findByTitle (String title);

}
