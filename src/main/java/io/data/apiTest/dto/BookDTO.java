package io.data.apiTest.dto;

public class BookDTO {
    private String id;
    private String name;
    private int pageCount;
    private AuthorDTO author;

    public BookDTO(String id, String name, int pageCount, AuthorDTO author) {
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
        this.author = author;
    }

    public String getId() {
        return id;
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
