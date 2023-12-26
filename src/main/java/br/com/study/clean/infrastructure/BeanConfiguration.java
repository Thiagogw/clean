package br.com.study.clean.infrastructure;

import br.com.study.clean.adapter.outbound.BookRepositoryImpl;
import br.com.study.clean.core.dataprovider.BookRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class BeanConfiguration {

    @Bean
    public BookRepository bookRepository(MongoTemplate mongoTemplate) {
        return new BookRepositoryImpl(mongoTemplate);
    }
}
