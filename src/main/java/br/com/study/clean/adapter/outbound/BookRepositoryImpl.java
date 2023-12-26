package br.com.study.clean.adapter.outbound;

import br.com.study.clean.core.entity.Book;
import br.com.study.clean.core.dataprovider.BookRepository;
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
