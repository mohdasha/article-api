package com.bitwse.article.controller;

import com.bitwse.article.annotation.Article;
import com.bitwse.article.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/articles")
public class ArticlesController {

    @Autowired
    private ArticlesService articlesService;

    @GetMapping

    public ResponseEntity<?> getArticles(@AuthenticationPrincipal Jwt jwt) {
        String userId = jwt.getClaim("user_id");
        return ResponseEntity.ok(articlesService.getArticlesByUserId(userId));
    }

    @GetMapping("/{articleId}")
    public ResponseEntity<?> getArticlesById(@AuthenticationPrincipal Jwt jwt,
                                             @PathVariable("articleId") String articleId) {
        String userId = jwt.getSubject();
        return ResponseEntity.ok(articlesService.getArticleById(articleId));
    }


    @PostMapping
    public ResponseEntity<?> addArticle(@RequestBody String text, @AuthenticationPrincipal Jwt jwt) {
        String userId = jwt.getSubject();
        return ResponseEntity.ok(articlesService.addNewArticle(text, userId).getArticleId());
    }

    @GetMapping("/resolve")
    public String resolve(@Article com.bitwse.article.domain.Article article) {
        return article.getTitle();
    }
}
