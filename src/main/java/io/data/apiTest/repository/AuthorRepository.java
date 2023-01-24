package io.data.apiTest.repository;

import io.data.apiTest.model.Author;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorRepository{
    private final List<Author> authors = new ArrayList<>(Arrays.asList(
            new Author("author-1", "Joanne", "Rowling"),
            new Author("author-2", "Herman", "Melville"),
            new Author("author-3", "Anne", "Rice")
    ));

    public Author getById(String id) {
        return authors.stream()
                .filter(author -> author.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Author> getAll() {
        return getAuthors();
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void add(Author author) {
        authors.add(author);
    }
}
