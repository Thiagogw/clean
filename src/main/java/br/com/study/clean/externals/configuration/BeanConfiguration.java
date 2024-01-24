package br.com.study.clean.externals.configuration;

import br.com.study.clean.externals.outbound.dataprovider.BookRepository;
import br.com.study.clean.externals.outbound.dataprovider.impl.BookRepositoryImpl;
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
