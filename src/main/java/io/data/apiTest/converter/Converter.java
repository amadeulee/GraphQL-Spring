package io.data.apiTest.converter;

import io.data.apiTest.dto.AuthorDTO;
import io.data.apiTest.dto.BookDTO;
import io.data.apiTest.model.Author;
import io.data.apiTest.model.Book;
import org.springframework.stereotype.Component;

@Component
public class Converter {
    public Book convertToBook(BookDTO bookDTO) {
        String bookId = bookDTO.getId();
        String bookName = bookDTO.getName();
        int pageCount = bookDTO.getPageCount();
        String authorId = bookDTO.getAuthor().getId();

        return new Book(bookId, bookName, pageCount, authorId);
    }

    public Author convertToAuthor(AuthorDTO authorDTO) {
        String id = authorDTO.getId();
        String firstName = authorDTO.getFirstName();
        String lastname = authorDTO.getLastName();

        return new Author(id, firstName, lastname);
    }
}
