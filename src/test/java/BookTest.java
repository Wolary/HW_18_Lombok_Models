import org.junit.jupiter.api.Test;

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
    void listOfBook() {
        Specs.request
                .when()
                .get("/BookStore/v1/Books")
                .then()
                .spec(Specs.respSpec)
                .log().body();

    }


}
