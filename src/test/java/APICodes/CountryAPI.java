package APICodes;

import POJO_Models.CountryPOJO;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CountryAPI extends Hooks{
    public String randomCountriesName() {
        return RandomStringUtils.randomAlphabetic(6);
    }
    public String randomCountriesCode() {
        return RandomStringUtils.randomAlphabetic(3);
    }

    CountryPOJO countries;
    Response response;

    @Test(priority = 1)
    public void createCountry(){
        countries = new CountryPOJO();
        countries.setName(randomCountriesName());
        countries.setCode(randomCountriesCode());
        countries.setShortName(randomCountriesCode());
        countries.setHasState(true);

        response = given()
                .spec(requestSpec)
                .body(countries)
                .when()
                .post("/school-service/api/countries")
                .then()
                .statusCode(201)
                .spec(responseSpec)
                .extract().response();
    }

    @Test (priority = 2, dependsOnMethods = "createCountry")
    public void getCountry(){
        given()
                .spec(requestSpec)
                .pathParam("countriesId", response.jsonPath().getString("id"))
                .when()
                .get("/school-service/api/countries/{countriesId}")
                .then()
                .statusCode(200)
                .spec(responseSpec)
                .extract().response();
    }

    @Test(priority = 3, dependsOnMethods = "createCountry")
    public void editCountry(){
        countries.setName(randomCountriesName());
        countries.setId(response.jsonPath().getString("id"));
        given()
                .spec(requestSpec)
                .body(countries)
                .when()
                .put("/school-service/api/countries")
                .then()
                .statusCode(200)
                .spec(responseSpec)
                .extract().response();
    }

    @Test(priority = 4, dependsOnMethods = "createCountry")
    public void deleteCountry(){
        given()
                .spec(requestSpec)
                .pathParam("countriesId", response.jsonPath().getString("id"))
                .when()
                .delete("/school-service/api/countries/{countriesId}")
                .then()
                .statusCode(200)
                .extract().response();
    }
}
