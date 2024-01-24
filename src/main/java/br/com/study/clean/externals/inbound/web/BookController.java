package br.com.study.clean.externals.inbound.web;

import br.com.study.clean.adapters.converter.BookConverter;
import br.com.study.clean.entities.domain.Book;
import br.com.study.clean.externals.inbound.web.dto.BookRequest;
import br.com.study.clean.usecases.BookUseCase;
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
    ResponseEntity<Void> create(BookRequest bookRequest) {
        Book book = new BookConverter().converter(bookRequest);

        String id = bookUseCase.save(book).getId();

        return ResponseEntity.created(URI.create(PATH + id)).build();
    }
}
