package testapi;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static io.restassured.RestAssured.given;

public class PostApiTest {
    @Test
    public void testCreatePost() {
        //du lieu json gui trong yeu cau post
        String requestBody = "{\n" +
                "    \"title\": \"foo\",\n" +
                "    \"body\": \"bar\",\n" +
                "    \"userId\": 1\n" +
                "}";
        //thiet lap restAssured
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        //thuc hien yeu cau post
        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .extract()
                .response();

        //kiem tra phan hoi tra ve
        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();
        System.out.println("Response body is: " + responseBody);

        //kiem tra 1 so gia tri trong phan hoi
        Assertions.assertEquals("foo", response.jsonPath().getString("title"));
        Assertions.assertEquals("bar", response.jsonPath().getString("body"));
        Assertions.assertEquals(1, response.jsonPath().getInt("userId"));
    }
}
