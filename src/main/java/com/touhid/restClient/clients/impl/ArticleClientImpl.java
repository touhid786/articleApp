package com.touhid.restClient.clients.impl;

import com.touhid.restClient.clients.ArticleClient;
import com.touhid.restClient.dtos.ArticleDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleClientImpl implements ArticleClient {

    private final RestClient restClient;

    @Override
    public List<ArticleDTO> getAllArticles() {
        try {
            return restClient.get()
                    .uri("/articles/all")
                    .retrieve()
                    .body(new ParameterizedTypeReference<List<ArticleDTO>>() {});
        } catch (Exception e) {
            throw new RuntimeException("Failed to fetch articles", e);
        }
    }

    @Override
    public ArticleDTO addArticle(ArticleDTO articleDTO) {
        try {
            return restClient.post()
                    .uri("/articles/add")
                    .body(articleDTO)
                    .retrieve()
                    .body(ArticleDTO.class);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add article", e);
        }
    }
}
