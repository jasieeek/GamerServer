package com.app.server.gamer.repostiory.news;

import com.app.server.gamer.model.news.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
