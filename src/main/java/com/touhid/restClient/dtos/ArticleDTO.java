package com.touhid.restClient.dtos;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArticleDTO {

    private Long articleId;

    private String articleTitle;

    private String  articleDescription;

}
