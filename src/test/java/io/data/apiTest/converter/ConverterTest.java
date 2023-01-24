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
        BookDTO bookDTO = new BookDTO( "Jogos Vorazes", 202, new AuthorDTO("maria", "rita"));


        Book newBook = converter.convertToBook(bookDTO);
        Author newAuthor = converter.convertToAuthor(bookDTO.getAuthor());


        assertEquals(newBook.getName(), "Jogos Vorazes");
        assertEquals(newAuthor.getFirstName(), "maria");
    }
}