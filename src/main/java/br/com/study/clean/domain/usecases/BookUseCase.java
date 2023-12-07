package br.com.study.clean.domain.usecases;

import br.com.study.clean.domain.entities.Book;

public interface BookUseCase {

    Book save(Book book);
}
