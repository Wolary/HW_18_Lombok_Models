package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BookDataGetSet {

    private BookGetSet data;

    public BookGetSet getData() { return data; }

    public void setData(BookGetSet data) { this.data = data; }
}
