package com.example.demo;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mongodb.util.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.Query;
import java.util.List;


/**
 * Created by ydx on 17-7-12.
 */
@RestController
@RequestMapping("/movie")
public class MovieBoxController {
    MovieBoxMongoRepository movieBoxMongoRepository;
    MongoTemplate mongoTemplate;
    @Autowired
    public MovieBoxController(MovieBoxMongoRepository movieBoxMongoRepository,MongoTemplate mongoTemplate){
        this.movieBoxMongoRepository = movieBoxMongoRepository;
        this.mongoTemplate = mongoTemplate;

    }

    @GetMapping("list_by_keyword")
    Page<Moviebox> getMovieListWithKeywordByDescTime(String keyword, Pageable pageable){
       return    movieBoxMongoRepository.findBykeyword(keyword,pageable);
    }

    @GetMapping("type_list")
    List getTypes(){
        return mongoTemplate.getCollection("moviebox").distinct("keyword");
//        JSONArray jsonArray = new JSONArray(list);
//        return jsonArray;
    }
}
