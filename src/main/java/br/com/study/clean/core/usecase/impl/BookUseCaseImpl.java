package br.com.study.clean.core.usecase.impl;

import br.com.study.clean.core.dataprovider.BookRepository;
import br.com.study.clean.core.entity.Book;
import br.com.study.clean.core.usecase.BookUseCase;

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
