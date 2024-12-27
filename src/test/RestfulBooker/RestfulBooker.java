package RestfulBooker;

import io.restassured.http.Method;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class RestfulBooker extends AbstractTest{
    @Test
    void createBookingTest(){
        File createBooking = new File("src/test/resources/createBooking.json");
        String bookingid = given()
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
        System.out.println("bookingid: " + bookingid);
    }

}
