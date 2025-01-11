package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
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
    protected static ResponseSpecification responseSpecification;
    protected static RequestSpecification requestSpecification;

    @BeforeAll
    static void pingTest() {
        given()
                .when()
                .request(Method.GET,getBaseUrl() + "/ping")
                .then()
                .statusCode(201);
    }

    static void initTest() {
        //В спецификацию зашиваем повторяющуюся логику для вызова в тестах
        responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(201)
                .expectContentType(ContentType.JSON)
                .build();
        requestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .build();
        //Объявляем спеку в глобальных переменных - для всего проекта
        RestAssured.responseSpecification = responseSpecification;
        RestAssured.requestSpecification = requestSpecification;
    }
    //Отдельный вызов спеки
    public RequestSpecification getRequestSpecification(){
        requestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .build();
        return requestSpecification;
    }
    public ResponseSpecification getResponseSpecification(){
        responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(201)
                .build();
        return responseSpecification;
    }

}
