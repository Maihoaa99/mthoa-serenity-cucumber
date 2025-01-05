package testapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetApiTest {
    @Test
    public void testGetApi(){
        RestAssured.baseURI = "https://reqres.in/api";

        Response response = given()
                .param("2")
                .header("Authorization", "Bearer uiopojhvbnm")
                .when()
                .get("/users?page=2")
                .then()
                .statusCode(200)
                .extract()
                .response();

        String responseBody = response.getBody().asString();
        System.out.println("Response Body is: " + responseBody);

        Assertions.assertEquals(2, response.jsonPath().getInt("page"));
        Assertions.assertEquals(6, response.jsonPath().getInt("per_page"));
        Assertions.assertEquals(12, response.jsonPath().getInt("total"));
        Assertions.assertEquals(2, response.jsonPath().getInt("total_pages"));

        //kiem tra so luong nguoi dung tra ve
        int totalUser = response.jsonPath().getList("data").size();
        Assertions.assertEquals(6, totalUser); //gia dinh trang co 6 user

        //kiem tra thong tin cua user dau tien trong danh sach
        Assertions.assertEquals(7, response.jsonPath().getInt("data[0].id"));
        Assertions.assertEquals("Michael", response.jsonPath().getString("data[0].first_name"));
        Assertions.assertEquals("Lawson", response.jsonPath().getString("data[0].last_name"));
        Assertions.assertEquals("michael.lawson@reqres.in", response.jsonPath().getString("data[0].email"));
    }
}
