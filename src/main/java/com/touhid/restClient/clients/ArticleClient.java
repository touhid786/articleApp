package com.touhid.restClient.clients;

import com.touhid.restClient.dtos.ArticleDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ArticleClient {

    List<ArticleDTO> getAllArticles();


    ArticleDTO addArticle(ArticleDTO articleDTO);
}
