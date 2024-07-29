package com.touhid.restClient.controllers;

import com.touhid.restClient.clients.ArticleClient;
import com.touhid.restClient.dtos.ArticleDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/articles")

public class ArticleController {

    private final ArticleClient articleClient;

    public ArticleController(ArticleClient articleClient){
        this.articleClient = articleClient;
    }


    @GetMapping
    public List<ArticleDTO> getAllArticles(){
        return articleClient.getAllArticles();
    }

    @PostMapping("/adds")
    public ArticleDTO addArticle(@RequestBody ArticleDTO articleDTO){
        return articleClient.addArticle(articleDTO);
    }
}
