package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class BookGetSet {
    private Long isbn;
    private String title;
    private String author;

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishВate() {
        return publishВate;
    }

    public void setPublishВate(String publishВate) {
        this.publishВate = publishВate;
    }

    @JsonProperty("publish_date")
    private String publishВate;
}
