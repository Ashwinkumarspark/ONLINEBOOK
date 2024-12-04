package com.example.SPARK.ONLINEBOOK.dal;

import com.example.SPARK.ONLINEBOOK.model.cartmodel;
import com.example.SPARK.ONLINEBOOK.model.ordermodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface cartmodelrepo extends MongoRepository<cartmodel, String> {

    List<cartmodel> FindByUserId (String userId);
}
