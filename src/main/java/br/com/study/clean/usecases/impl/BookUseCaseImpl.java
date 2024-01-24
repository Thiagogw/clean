package br.com.study.clean.usecases.impl;

import br.com.study.clean.externals.outbound.dataprovider.BookRepository;
import br.com.study.clean.entities.domain.Book;
import br.com.study.clean.usecases.BookUseCase;

public class BookUseCaseImpl implements BookUseCase {

    private final BookRepository bookRepository;

    public BookUseCaseImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }
}
