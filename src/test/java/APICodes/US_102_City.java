package APICodes;

import POJO_Models.CountryPOJO;
import POJO_Models.US_102_CitiesPOJO;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class US_102_City  extends  Hooks{

    public  String randomCitiesName(){
        return RandomStringUtils.randomAlphabetic(7);
    }
    public  String randomCitiesCode(){
        return  RandomStringUtils.randomAlphabetic(4);
    }
    US_102_CitiesPOJO cities;
    CountryPOJO country;
    Response response;

    @Test
    public  void listOfCities(){

       response = given()
                .spec(requestSpec)
                .when()
                .get("/school-service/api/cities")
                .then()
                .statusCode(200)
                .spec(responseSpec)
                .extract().response();
    }

   @Test
   public  void getCity(){
        String requestBody = "{" +
                "  \"name\": \"Armstrongfort\"," +
                "  \"countryId\": \"63a41a0dcb75ee5c2199a8bc\"" +
                "}";
       ;
    response = given()
             .spec(requestSpec)
              .body(requestBody)
             .when()
             .post("/school-service/api/cities/search")
             .then()
             .statusCode(200)
             .spec(responseSpec)
             .extract().response();
   }

   @Test
    public void createCity(){
        cities = new US_102_CitiesPOJO();
        country = new CountryPOJO();
        country.setId("62fe59b63524797773da0531");
        cities.setId(null);
        cities.setName("Iluzium");
        cities.setCountry(country);
        cities.setState(null);
        cities.setTranslateName(new String[]{});

        response = given()
                .spec(requestSpec)
                .body(cities)
                .when()
                .post("/school-service/api/cities")
                .then()
                .statusCode(201)
                .spec(responseSpec)
                .extract().response();
   }
   @Test
   public void updateCity(){
       cities = new US_102_CitiesPOJO();
       country = new CountryPOJO();
       country.setId("62fe59b63524797773da0531");
       cities.setId("66523d2c12d84a691b4e3b9a");
       cities.setName("Iluzium_City");
       cities.setCountry(country);
       cities.setState(null);
       cities.setTranslateName(new String[]{});

       response = given()
               .spec(requestSpec)
               .body(cities)
               .when()
               .put("/school-service/api/cities")
               .then()
               .statusCode(200)
               .spec(responseSpec)
               .extract().response();

   }
@Test(dependsOnMethods = "updateCity")
    public void deleteCity(){
        given()
                .spec(requestSpec)
                .pathParam("cityId", response.jsonPath().getString("id"))
                .when()
                .delete("/school-service/api/cities/{cityId}")
                .then()
                .statusCode(200)
                .extract().response();


}

}
