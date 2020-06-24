package com.bitwse.article.service;

import com.bitwse.article.dao.ArticlesRepository;
import com.bitwse.article.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ArticlesService {

    @Autowired
    private ArticlesRepository articlesRepository;

    public List<Article> getArticles() {
        return (List<Article>) articlesRepository.findAll();
    }

    public Optional<List<Article>> getArticlesByUserId(String userId) {
        return articlesRepository.findByOwner(UUID.fromString(userId));
    }

    public Optional<Article> getArticleById(String articleId) {
        return articlesRepository.findByArticleId((UUID.fromString(articleId)));
    }
    public Article addNewArticle(String text, String userId) {
        return articlesRepository.save(new Article(text, UUID.fromString(userId)));
    }
}
