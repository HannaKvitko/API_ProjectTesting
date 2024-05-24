package APICodes;

import POJO_Models.CountryPOJO;
import POJO_Models.StatePOJO;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class StateAPI extends Hooks {
    private String randomCountriesName() {
        return "Country" + RandomStringUtils.randomAlphabetic(5);
    }

    private String randomCountriesCode() {
        return RandomStringUtils.randomAlphabetic(3);
    }
    StatePOJO state;
    CountryPOJO country;
    Response response;


    @Test(priority = 1)
    public void createState(){
        country = new CountryPOJO();
        state = new StatePOJO();
        state.setName(randomCountriesName());
        state.setShortName(randomCountriesCode());
        country.setId("634e67104354040c111482af");
        state.setCountry(country);

        response = given()
                .spec(requestSpec)
                .body(state)
                .when()
                .post("/school-service/api/states")
                .then()
                .statusCode(201)
                .spec(responseSpec)
                .extract().response();
    }

    @Test(priority = 2, dependsOnMethods = "createState")
    public void getState(){
        given()
                .spec(requestSpec)
                .pathParam("stateId", response.jsonPath().getString("id"))
                .when()
                .get("/school-service/api/states/{stateId}")
                .then()
                .statusCode(200)
                .spec(responseSpec)
                .extract().response();
    }

    @Test(priority = 3, dependsOnMethods = "createState")
    public void editState(){
        state.setName(randomCountriesName());
        state.setId(response.jsonPath().getString("id"));
        given()
                .spec(requestSpec)
                .body(state)
                .when()
                .put("/school-service/api/states")
                .then()
                .statusCode(200)
                .spec(responseSpec)
                .extract().response();
    }

    @Test(priority = 4, dependsOnMethods = "createState")
    public void deleteState(){
        given()
                .spec(requestSpec)
                .pathParam("stateId", response.jsonPath().getString("id"))
                .when()
                .delete("/school-service/api/states/{stateId}")
                .then()
                .statusCode(200)
                .extract().response();
    }}



