package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ExampleResourceTest {

//    @Test
//    public void testHelloEndpoint() {
//        given()
//          .when().post("/hello")
//          .then()
//             .statusCode(202)
//             .body(is("hello"));
//    }

}