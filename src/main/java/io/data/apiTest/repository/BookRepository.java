package io.data.apiTest.repository;

import io.data.apiTest.model.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    private static int index = 4;
    private final List<Book> books = new ArrayList<>(Arrays.asList(
            new Book("book-1", "Harry Potter and the Philosopher's Stone", 223, "author-1"),
            new Book("book-2", "Moby Dick", 635, "author-2"),
            new Book("book-3", "Interview with the vampire", 371, "author-3")
    ));

    public Book getById(String id) {
        return books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Book> getAll() {
        return getBooks();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void add(Book book) {
        book.setId("book-" + String.valueOf(index));
        books.add(book);
        index++;
    }
}
