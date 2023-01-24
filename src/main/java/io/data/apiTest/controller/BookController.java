package io.data.apiTest.controller;

import io.data.apiTest.converter.Converter;
import io.data.apiTest.dto.BookDTO;
import io.data.apiTest.model.Author;
import io.data.apiTest.model.Book;
import io.data.apiTest.repository.AuthorRepository;
import io.data.apiTest.repository.BookRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    Converter converter;

    @QueryMapping
    public Book bookById(@Argument String id) {
        return bookRepository.getById(id);
    }

    @QueryMapping
    public String hello() {
        return "Hello World";
    }

    @QueryMapping
    public List<Book> books() {
        return bookRepository.getAll();
    }

    @MutationMapping
    public Book createBook(@Argument BookDTO book) {
        Author newAuthor = converter.convertToAuthor(book.getAuthor());
        authorRepository.add(newAuthor);

        Book newBook = converter.convertToBook(book);
        newBook.setAuthorId(authorRepository.getAuthorId(newAuthor));
        bookRepository.add(newBook);

        return newBook;
    }


    @SchemaMapping
    public Author author(Book book) {
        return authorRepository.getById(book.getAuthorId());
    }
}
