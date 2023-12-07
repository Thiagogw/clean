package br.com.study.clean.presentation.controller;

import br.com.study.clean.domain.entities.Book;
import br.com.study.clean.domain.usecases.BookUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping
public class BookController {

    public static final String PATH = "/v1/books";

    private final BookUseCase bookUseCase;

    public BookController(BookUseCase bookUseCase) {
        this.bookUseCase = bookUseCase;
    }

    @PostMapping(path = PATH)
    ResponseEntity<Void> create(Book book) {
        String id = bookUseCase.save(book).getId();

        return ResponseEntity.created(URI.create(PATH + id)).build();
    }
}
