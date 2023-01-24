package io.data.apiTest.dto;

public class BookDTO {
    private final String name;
    private final int pageCount;
    private final AuthorDTO author;

    public BookDTO(String name, int pageCount, AuthorDTO author) {
        this.name = name;
        this.pageCount = pageCount;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public AuthorDTO getAuthor() {
        return author;
    }
}
