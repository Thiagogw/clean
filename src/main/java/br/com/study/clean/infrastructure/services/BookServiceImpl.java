package br.com.study.clean.infrastructure.services;

import br.com.study.clean.domain.entities.Book;
import br.com.study.clean.domain.services.BookService;
import br.com.study.clean.domain.repositories.BookRepository;

public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }
}
