package br.com.study.clean.core.dataprovider;

import br.com.study.clean.core.entity.Book;

public interface BookRepository {

    Book save(Book book);
}
