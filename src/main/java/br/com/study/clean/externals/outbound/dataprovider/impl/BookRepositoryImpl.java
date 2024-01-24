package br.com.study.clean.externals.outbound.dataprovider.impl;

import br.com.study.clean.entities.domain.Book;
import br.com.study.clean.externals.outbound.dataprovider.BookRepository;
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
