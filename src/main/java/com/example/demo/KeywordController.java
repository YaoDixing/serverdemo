package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ydx on 17-7-13.
 */
@RestController
@RequestMapping("keyword")
public class KeywordController  {
    KeywordMongoRepository keywordMongoRepository;

    @Autowired
    public KeywordController(KeywordMongoRepository keywordMongoRepository){
        this.keywordMongoRepository = keywordMongoRepository;
    }

//    @GetMapping("list")
//    List<String> getKeywordList(){
//        return keywordMongoRepository.distinctKeyword();
//    }


}
