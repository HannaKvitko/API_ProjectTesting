package APICodes;

import POJO_Models.US109_GradingSchemePojo;
import POJO_Models.US110_IncidentPojo;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import java.util.Random;

import static io.restassured.RestAssured.given;

public class US110_IncidentList extends Hooks {
    private static final Random random = new Random();
    public String randomIncidentName() {
        return RandomStringUtils.randomAlphabetic(6);
    }
    public String randomIncidentCode() {
        return RandomStringUtils.randomAlphabetic(3);
    }
    public static boolean randomBoolean() {
        return random.nextBoolean();
    }

    public static int randomInteger(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }

    US110_IncidentPojo incidentPojo;
    Response response;


    @Test(priority = 1)
    public void createIncident(){
        incidentPojo = new US110_IncidentPojo();
        incidentPojo.setName(randomIncidentName());
        incidentPojo.setActive(true);
        incidentPojo.setAcademicBased(false);
        incidentPojo.setSchoolId("6576fd8f8af7ce488ac69b89");
        incidentPojo.setMinPoint(randomInteger(1,10));
        incidentPojo.setMaxPoint(randomInteger(10,20));
        response = given()
                .spec(requestSpec)
                .body(incidentPojo)
                .when()
                .post("/school-service/api/incident-type")
                .then()
                .statusCode(201)
                .spec(responseSpec)
                .extract().response();
        response.prettyPrint();
    }

    @Test (priority = 2, dependsOnMethods = "createIncident")
    public void getİncident(){
        incidentPojo = new US110_IncidentPojo();
        incidentPojo.setSchoolId("6576fd8f8af7ce488ac69b89");
        given()
                .spec(requestSpec)
                .body(incidentPojo)
                //.pathParam("", response.jsonPath().getString("id"))
                .when()
                .post("/school-service/api/incident-type/search")
                .then()
                .statusCode(200)
                .spec(responseSpec)
                .extract().response();
    }

    @Test(priority = 3, dependsOnMethods = "createIncident")
    public void editİncident(){
        incidentPojo.setName(randomIncidentName());
        incidentPojo.setId(response.jsonPath().getString("id"));
        given()
                .spec(requestSpec)
                .body(incidentPojo)
                .when()
                .put("/school-service/api/incident-type")
                .then()
                .statusCode(200)
                .spec(responseSpec)
                .extract().response();
        response.prettyPrint();
    }
    @Test(priority = 4, dependsOnMethods = "createIncident")
    public void deleteİncident(){
        given()
                .spec(requestSpec)
                .pathParam("deleteIncident", response.jsonPath().getString("id"))
                .when()
                .delete("/school-service/api/incident-type/{deleteIncident}")
                .then()
                .statusCode(200)
                .extract().response();
    }



}
