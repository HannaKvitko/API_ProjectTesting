package APICodes;

import POJO_Models.Student;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class educationGroupAPI_108 extends Hooks {

    @Test(priority = 1)
    public void createState() {
        // Student group ID (ensure this ID exists in your database)
        String studentGroupId = "664e154e8f6fce6a6afa68cd";

        // List of student IDs to add
        List<String> studentIds = Arrays.asList(
                "657771ca8af7ce488ac6a628",
                "657771ca8af7ce488ac6a629",
                "657771ca8af7ce488ac6a62d",
                "657771ca8af7ce488ac6a631",
                "657771ca8af7ce488ac6a62f",
                "657771ca8af7ce488ac6a62e",
                "657771ca8af7ce488ac6a62a",
                "657771ca8af7ce488ac6a630",
                "657771ca8af7ce488ac6a62c",
                "657771ca8af7ce488ac6a62b"
        );

        Response response = given()
                .spec(requestSpec)
                .contentType("application/json") // Ensure correct content type
                .body(studentIds)
                .when()
                .post("school-service/api/student-group/" + studentGroupId + "/add-students?page=0&size=10")
                .then()
                .log().all()
                .statusCode(200)
                .spec(responseSpec)
                .extract().response();

        System.out.println("CreateState Response: " + response.getBody().asString());
    }
}