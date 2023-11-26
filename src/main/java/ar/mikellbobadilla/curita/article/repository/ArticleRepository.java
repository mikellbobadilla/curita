package ar.mikellbobadilla.curita.article.repository;

import ar.mikellbobadilla.curita.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
