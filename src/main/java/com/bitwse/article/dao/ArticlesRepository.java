package com.bitwse.article.dao;

import com.bitwse.article.domain.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ArticlesRepository extends CrudRepository<Article, String> {
    Optional<List<Article>> findByOwner(UUID uuid);

    Optional<Article> findByArticleId(UUID articleId);
}
