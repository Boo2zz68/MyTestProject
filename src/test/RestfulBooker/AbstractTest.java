package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public abstract class AbstractTest {
    public static String getBaseUrl() {
        return baseUrl;
    }
    private static String baseUrl = "https://restful-booker.herokuapp.com";
    static File auth = new File("src/test/resources/auth.json");

    @BeforeAll
    static void pingTest() {
        given()
                .when()
                .request(Method.GET,getBaseUrl() + "/ping")
                .then()
                .statusCode(201);
    }

}
