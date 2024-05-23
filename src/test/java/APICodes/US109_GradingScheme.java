package APICodes;

import POJO_Models.US109_GradingSchemePojo;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import java.util.Random;

import static io.restassured.RestAssured.given;

public class US109_GradingScheme extends Hooks {
    private static final Random random = new Random();
    public String randomSchemesName() {
        return RandomStringUtils.randomAlphabetic(8);
    }
    public String randomSchemesCode() {
        return RandomStringUtils.randomAlphabetic(3);
    }
    public static boolean randomBoolean() {
        return random.nextBoolean();
    }

    US109_GradingSchemePojo gradingSchemePojo;
    Response response;

    @Test(priority = 1)
    public void createScheme(){
        gradingSchemePojo = new US109_GradingSchemePojo();
        gradingSchemePojo.setName(randomSchemesName());
        gradingSchemePojo.setActive(true);
        gradingSchemePojo.setSchoolId("6576fd8f8af7ce488ac69b89");
        gradingSchemePojo.setType("POINT");
        gradingSchemePojo.setEnablePoint(false);
        gradingSchemePojo.setMinPointToPass(24);
        response = given()
                .spec(requestSpec)
                .body(gradingSchemePojo)
                .when()
                .post("/school-service/api/grading-schemes")
                .then()
                .statusCode(201)
                .spec(responseSpec)
                .extract().response();
        response.prettyPrint();
    }
    @Test (priority = 2, dependsOnMethods = "createScheme")
    public void getScheme(){
        given()
                .spec(requestSpec)
                .pathParam("schoolID", response.jsonPath().getString("id"))
                .when()
                .get("/school-service/api/grading-schemes/school/{schoolID}/search")
                .then()
                .statusCode(200)
                .spec(responseSpec)
                .extract().response();
    }

    @Test(priority = 3, dependsOnMethods = "createScheme")
    public void editSceheme(){
        gradingSchemePojo.setName(randomSchemesName());
        gradingSchemePojo.setId(response.jsonPath().getString("id"));
        given()
                .spec(requestSpec)
                .body(gradingSchemePojo)
                .when()
                .put("/school-service/api/grading-schemes")
                .then()
                .statusCode(200)
                .spec(responseSpec)
                .extract().response();
        response.prettyPrint();
    }


    @Test(priority = 4, dependsOnMethods = "createScheme")
    public void deleteScheme(){
        given()
                .spec(requestSpec)
                .pathParam("deleteScheme", response.jsonPath().getString("id"))
                .when()
                .delete("/school-service/api/incident-type/{deleteScheme}")
                .then()
                .statusCode(400)
                .extract().response();
    }
}
