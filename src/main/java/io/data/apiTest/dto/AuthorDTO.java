package io.data.apiTest.dto;

public class AuthorDTO {
    private String id;
    private String firstName;
    private String lastName;

    public AuthorDTO(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
