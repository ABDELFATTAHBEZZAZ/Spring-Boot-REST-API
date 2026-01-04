package ma.formations.rest.tprest.dao;

import ma.formations.rest.tprest.service.model.Article;
import java.util.List;
public interface IDao {
    Article findById(Long id);
    List<Article> findAll();
    void save(Article article);
    void deleteById(Long id);
}