package br.com.study.clean.adapters.converter;

import br.com.study.clean.entities.domain.Book;
import br.com.study.clean.externals.inbound.web.dto.BookRequest;

public class BookConverter {

    public Book converter(BookRequest bookRequest) {
        Book book = new Book();
        book.setId(bookRequest.getId());
        book.setAuthor(bookRequest.getAuthor());
        book.setName(bookRequest.getName());
        book.setEdition(bookRequest.getEdition());
        book.setYear(bookRequest.getYear());
        book.setPublisher(bookRequest.getPublisher());

        return book;
    }
}
