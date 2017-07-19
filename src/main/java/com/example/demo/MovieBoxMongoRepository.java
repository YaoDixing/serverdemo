package com.example.demo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by ydx on 17-7-12.
 */
@Repository
public interface MovieBoxMongoRepository extends MongoRepository<Moviebox,String> {

    Page<Moviebox> findBykeyword(String keyword, Pageable pageable);


}
