package com.example.SPARK.ONLINEBOOK.dal;

import com.example.SPARK.ONLINEBOOK.model.bookmodel;
import com.example.SPARK.ONLINEBOOK.model.ordermodel;
import com.example.SPARK.ONLINEBOOK.model.usermodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface usermodelrepo extends MongoRepository<usermodel, String>{
    List<usermodel> FindByrId (String id);


}