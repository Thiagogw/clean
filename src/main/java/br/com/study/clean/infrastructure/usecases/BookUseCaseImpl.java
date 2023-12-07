package br.com.study.clean.infrastructure.usecases;

import br.com.study.clean.domain.entities.Book;
import br.com.study.clean.domain.services.BookService;
import br.com.study.clean.domain.usecases.BookUseCase;

public class BookUseCaseImpl implements BookUseCase {

    private final BookService bookService;

    public BookUseCaseImpl(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public Book save(Book book) {
        return bookService.save(book);
    }
}
