package APICodes;

import POJO_Models.US108_EducationStandardPOJO;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import java.util.Random;

import static io.restassured.RestAssured.given;

public class US108_EducationStandard extends Hooks{

    private static final Random random = new Random();
    public String randomEducationName() {
        return RandomStringUtils.randomAlphabetic(8);
    }
    public String randomEducationCode() {
        return RandomStringUtils.randomAlphabetic(3);
    }
    public static boolean randomBoolean() {
        return random.nextBoolean();
    }

    US108_EducationStandardPOJO educationStandardPOJO;

    Response response;
    @Test
    public void CreateEducationStandard(){
        educationStandardPOJO = new US108_EducationStandardPOJO();
        educationStandardPOJO.setName(randomEducationName());
        educationStandardPOJO.setDescription(randomEducationCode());
        educationStandardPOJO.setSchoolId("6576fd8f8af7ce488ac69b89");
        response = given()
                .spec(requestSpec)
                .body(educationStandardPOJO)
                .when()
                .post("/school-service/api/education-standard")
                .then()
                .statusCode(201)
                .spec(responseSpec)
                .extract().response();

    }
}
