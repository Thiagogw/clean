package br.com.study.clean.domain.repositories;

import br.com.study.clean.domain.entities.Book;

public interface BookRepository {

    Book save(Book book);
}
