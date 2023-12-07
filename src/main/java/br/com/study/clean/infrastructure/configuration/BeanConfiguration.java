package br.com.study.clean.infrastructure.configuration;

import br.com.study.clean.domain.services.BookService;
import br.com.study.clean.infrastructure.services.BookServiceImpl;
import br.com.study.clean.domain.repositories.BookRepository;
import br.com.study.clean.infrastructure.repositories.BookRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class BeanConfiguration {

    @Bean
    public BookService bookService(BookRepository bookRepository) {
        return new BookServiceImpl(bookRepository);
    }

    @Bean
    public BookRepository bookRepository(MongoTemplate mongoTemplate) {
        return new BookRepositoryImpl(mongoTemplate);
    }
}
