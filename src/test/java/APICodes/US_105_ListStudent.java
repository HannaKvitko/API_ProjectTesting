package APICodes;


import POJO_Models.CountryPOJO;
import POJO_Models.US_105_ListStudentPOJO;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;


import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_105_ListStudent extends Hooks {

    public String randomStudentGroupName() {
        return RandomStringUtils.randomAlphabetic(6);
    }

    Response response;

    String existingGroupId;
    @Test
    public void ListStudents() {
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("schoolId", "6576fd8f8af7ce488ac69b89");

        Response response = given()
                .spec(requestSpec)
                .body(requestBody)
                .when()
                .post("/school-service/api/student-group/search")
                .then()
                .spec(responseSpec)
                .statusCode(200)
                .extract()
                .response();

    }
    @Test(priority = 3)
    public void addStudentGroup() {
        US_105_ListStudentPOJO newGroup = new US_105_ListStudentPOJO();
        newGroup.setId(null);
        newGroup.setSchoolId("6576fd8f8af7ce488ac69b89");
        newGroup.setName(randomStudentGroupName());
        newGroup.setDescription(null);
        newGroup.setActive(true);

        Response response = given()
                .spec(requestSpec)
                .contentType(ContentType.JSON)
                .body(newGroup)
                .when()
                .post("/school-service/api/student-group")
                .then()
                .spec(responseSpec)
                .statusCode(201)
                .log().body()
                .extract()
                .response();

       existingGroupId = response.jsonPath().getString("id");
       System.out.println("Created group with ID: " + existingGroupId);
    }

    @Test(priority = 3, dependsOnMethods = "addStudentGroup")
    public void updateStudentGroup() {
        US_105_ListStudentPOJO updatedGroup = new US_105_ListStudentPOJO();

        updatedGroup.setId(existingGroupId);
        updatedGroup.setSchoolId("6576fd8f8af7ce488ac69b89");
        updatedGroup.setName(randomStudentGroupName());
        updatedGroup.setDescription("Updated description for the group.");
        updatedGroup.setActive(false);

        Response response = given()
                .spec(requestSpec)
                .contentType(ContentType.JSON)
                .body(updatedGroup)
                .when()
                .put("/school-service/api/student-group")
                .then()
                .spec(responseSpec)
                .statusCode(200)
                .log().body()
                .extract()
                .response();

          System.out.println("Updated group with ID: " + existingGroupId);
    }

    @Test(priority = 4, dependsOnMethods = "updateStudentGroup")
    public void deleteGroup(){
        given()
                .spec(requestSpec)
                .pathParam("SchoolId", existingGroupId)
                .when()
                .delete("/school-service/api/student-group/{SchoolId}")
                .then()
                .statusCode(200)
                .extract().response();
    }


}

