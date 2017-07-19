package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ydx on 17-7-13.
 */
@Repository
public interface KeywordMongoRepository extends MongoRepository<Moviebox,String> {

//    List<String> distinctKeyword();
}
