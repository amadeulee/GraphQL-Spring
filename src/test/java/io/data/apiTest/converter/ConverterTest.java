package io.data.apiTest.converter;

import static org.junit.jupiter.api.Assertions.*;

import io.data.apiTest.dto.AuthorDTO;
import io.data.apiTest.dto.BookDTO;
import io.data.apiTest.model.Author;
import io.data.apiTest.model.Book;
import org.junit.jupiter.api.Test;

class ConverterTest {

    @Test
    public void convertToBook() {
        Converter converter = new Converter();
        BookDTO bookDTO = new BookDTO("book-1", "Jogos Vorazes", 202, new AuthorDTO("author-1", "maria", "rita"));

        Book newBook = converter.convertToBook(bookDTO);
        Author newAuthor = converter.convertToAuthor(bookDTO.getAuthor());


        System.out.println(newBook);
        System.out.println(newAuthor);

        assertEquals(newBook.getAuthorId(), newAuthor.getId());
    }
}