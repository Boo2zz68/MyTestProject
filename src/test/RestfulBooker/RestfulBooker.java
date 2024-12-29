package RestfulBooker;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class RestfulBooker extends AbstractTest{
    /*@BeforeAll
    static void setUp() {
        //Логирование при ошибке
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
     */
    @Test
    @Description("Создание пользователя")
    @Severity(SeverityLevel.CRITICAL)
    void createBookingTest(){
        File createBooking = new File("src/test/resources/createBooking.json");
        String bookingId = given()
                .body(createBooking)
                .header("Content-Type", "application/json")
                .when()
                .request(Method.POST, getBaseUrl() + "/booking")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .jsonPath()
                .get("bookingid")
                .toString();
        //.log() логирование запроса
        //.all()
        System.out.println("bookingid: " + bookingId);
    }
    @Test
    @Description("Получение пользователя по Id")
    @Severity(SeverityLevel.NORMAL)
    void getBookingTest(){
        File createBooking = new File("src/test/resources/createBooking.json");
        String bookingId = given()
                .body(createBooking)
                .header("Content-Type", "application/json")
                .when()
                .request(Method.POST,getBaseUrl() + "/booking")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .jsonPath()
                .get("bookingid")
                .toString();
        System.out.println("bookingid: " + bookingId);
        String response = given()
                .header("Content-Type", "application/json")
                .when()
                .request(Method.GET,getBaseUrl() + "/booking/" + bookingId)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response()
                .asString();
        System.out.println("response: " + response);
    }
    @Test
    @Description("Изменение пользователя")
    @Severity(SeverityLevel.NORMAL)
    void updateBooking() {
        File createBooking = new File("src/test/resources/createBooking.json");
        String bookingId = given()
                .body(createBooking)
                .header("Content-Type", "application/json")
                .when()
                .request(Method.POST,getBaseUrl() + "/booking")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .jsonPath()
                .get("bookingid")
                .toString();
        System.out.println("bookingid: " + bookingId);
        String token = given()
                .body(auth)
                .header("Content-Type", "application/json")
                .when()
                .request(Method.POST,getBaseUrl() + "/auth")
                .then()
                .statusCode(200)
                .extract()
                .jsonPath()
                .get("token")
                .toString();
        System.out.println("token: " + token);
        File updateBooking = new File("src/test/resources/updateBooking.json");
        String response = given()
                .body(updateBooking)
                .header("Content-Type", "application/json")
                .header("Cookie", "token=" + token)
                .when()
                .request(Method.PUT,getBaseUrl() + "/booking/" + bookingId)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response()
                .asString();
        System.out.println("response: " + response);
    }
    @Test
    @Description("Частичное изменение пользователя")
    @Severity(SeverityLevel.NORMAL)
    void partialUpdateBooking() {
        File createBooking = new File("src/test/resources/createBooking.json");
        String bookingId = given()
                .body(createBooking)
                .header("Content-Type", "application/json")
                .when()
                .request(Method.POST,getBaseUrl() + "/booking")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .jsonPath()
                .get("bookingid")
                .toString();
        System.out.println("bookingid: " + bookingId);
        String token = given()
                .body(auth)
                .header("Content-Type", "application/json")
                .when()
                .request(Method.POST,getBaseUrl() + "/auth")
                .then()
                .statusCode(200)
                .extract()
                .jsonPath()
                .get("token")
                .toString();
        System.out.println("token: " + token);
        File partialUpdateBooking = new File("src/test/resources/partialUpdateBooking.json");
        String response = given()
                .body(partialUpdateBooking)
                .header("Content-Type", "application/json")
                .header("Cookie", "token=" + token)
                .when()
                .request(Method.PATCH,getBaseUrl() + "/booking/" + bookingId)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response()
                .asString();
        System.out.println("response: " + response);
    }
    @Test
    @Description("Удаление пользователя")
    @Severity(SeverityLevel.NORMAL)
    void getDeleteTest() {
        File createBooking = new File("src/test/resources/createBooking.json");
        String bookingId = given()
                .body(createBooking)
                .header("Content-Type", "application/json")
                .when()
                .request(Method.POST, getBaseUrl() + "/booking")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .jsonPath()
                .get("bookingid")
                .toString();
        System.out.println("bookingid: " + bookingId);
        String token = given()
                .body(auth)
                .header("Content-Type", "application/json")
                .when()
                .request(Method.POST,getBaseUrl() + "/auth")
                .then()
                .statusCode(200)
                .extract()
                .jsonPath()
                .get("token")
                .toString();
        System.out.println("token: " + token);
        given()
                .header("Content-Type", "application/json")
                .header("Cookie", "token=" + token)
                .header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .when()
                .request(Method.DELETE,getBaseUrl() + "/booking/" + bookingId)
                .then()
                .statusCode(201);
    }
}
