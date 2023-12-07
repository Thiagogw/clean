package br.com.study.clean.infrastructure.repositories;

import br.com.study.clean.domain.entities.Book;
import br.com.study.clean.domain.repositories.BookRepository;
import org.springframework.data.mongodb.core.MongoTemplate;

public class BookRepositoryImpl implements BookRepository {

    private final MongoTemplate mongoTemplate;

    public BookRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Book save(Book book) {
        return mongoTemplate.save(book);
    }
}
