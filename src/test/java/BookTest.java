import lombok.BookDataLombok;
import lombok.BookLombok;
import model.BookDataGetSet;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
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

    //Не осилил груви запрос по авторам
//    @Test
//    void listOfBooksGroovy() {
//        given()
//                .spec(Specs.request)
//                .log().uri()
//                .when()
//                .get("/BookStore/v1/Books")
//                .then()
//                .log().body()
//                .body("data.FindAll{it.author = ~/*?/}.author.flatten()",
//                        hasItem("Axel Rauschmayer"));
//    }
}
