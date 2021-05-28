import lombok.BookDataLombok;
import lombok.BookLombok;
import model.BookDataGetSet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    @Test
    void singleBook() {
        Specs.request
                .when()
                .get("BookStore/v1/Book?ISBN=9781449331818")
                .then()
                .spec(Specs.respSpec)
                .log().body();
    }

    @Test
    void listOfBooks() {
        Specs.request
                .when()
                .get("/BookStore/v1/Books")
                .then()
                .spec(Specs.respSpec)
                .log().body();
    }

    @Test
    void singleBookModel() {
        BookDataGetSet data = Specs.request
                .when()
                .get("BookStore/v1/Book?ISBN=9781449331818")
                .then()
                .spec(Specs.respSpec)
                .log().body()
                .extract().as(BookDataGetSet.class);
    }

    @Test
    void listOfBooksModel() {
        BookDataGetSet data = Specs.request
                .when()
                .get("/BookStore/v1/Books")
                .then()
                .spec(Specs.respSpec)
                .log().body()
                .extract().as(BookDataGetSet.class);
    }

    @Test
    void singleBookLombok() {
        BookLombok data = Specs.request
                .when()
                .get("BookStore/v1/Book?ISBN=9781449331818")
                .then()
                .spec(Specs.respSpec)
                .log().body()
                .extract().as(BookLombok.class);
    }

    @Test
    void listOfBooksLombok() {
        BookDataLombok data = Specs.request
                .when()
                .get("/BookStore/v1/Books")
                .then()
                .spec(Specs.respSpec)
                .log().body()
                .extract().as(BookDataLombok.class);
    }
}
