package com.example.SPARK.ONLINEBOOK.dal;

import com.example.SPARK.ONLINEBOOK.model.bookmodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface bookmodelrepo extends MongoRepository<bookmodel, String> {
    @Autowired
    bookmodelrepo repo = null;

    public default List<bookmodel> GetAllBooks(){
        return repo.findAll();
    }


}
