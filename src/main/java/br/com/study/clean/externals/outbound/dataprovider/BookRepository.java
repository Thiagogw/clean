package br.com.study.clean.externals.outbound.dataprovider;

import br.com.study.clean.entities.domain.Book;

public interface BookRepository {

    Book save(Book book);
}
