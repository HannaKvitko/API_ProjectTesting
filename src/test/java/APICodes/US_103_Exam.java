package APICodes;

import POJO_Models.*;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Collections;

import static io.restassured.RestAssured.given;

public class US_103_Exam extends Hooks {
    US_103_ExamPOJO exam;
    US_103_EmailMessage emailMessage;
  //  US_103_AcademicPeriod academicPeriod;
    US_103_GradeLevel gradeLevel;
    Response response;

    @Test
    public void createExam(){
        gradeLevel = new US_103_GradeLevel();
        gradeLevel.setId("657713978af7ce488ac6a632");

        emailMessage = new US_103_EmailMessage();
        emailMessage.setSubject("");
        emailMessage.setContent("");

        exam = new US_103_ExamPOJO();
        exam.setId(null);
        exam.setName("Math9");
        exam.setTranslateName(new String[]{});
        exam.setSchool("6576fd8f8af7ce488ac69b89");
        exam.setGradeLevel(gradeLevel);
        exam.setAcademicPeriod("6577022e8af7ce488ac69b96");
        exam.setActive(true);
        exam.setDescription("");
        exam.setNote("");
        exam.setAgreementText("");
        exam.setSendSMS(false);
        exam.setSms("");
        exam.setSendEmailEnabled(false);
        exam.setEmailMessage(emailMessage);
        exam.setRegistrationStartDate(null);
        exam.setRegistrationEndDate(null);
        exam.setPaid(false);
        exam.setPrice(0);
        exam.setBankAccount(null);
        exam.setSendEmailToRegistrar(false);
        exam.setRegistrarEmails(new String[]{});
        exam.setShowDescFirst(false);
        exam.setShowNoteFirst(false);
        exam.setNoteEnabled(false);
        exam.setDescEnabled(false);
        exam.setAgreementEnabled(false);
        exam.setDocuments(new String[]{});

response = given()
                .spec(requestSpec)
                .body(exam)
                .when()
                .post("/school-service/api/exams")
                .then()
                .statusCode(201)
                .spec(responseSpec)
                .extract().response();
    }

    @Test
    public void UpdateExam(){
        gradeLevel = new US_103_GradeLevel();
        gradeLevel.setId("657713978af7ce488ac6a632");

        emailMessage = new US_103_EmailMessage();
        emailMessage.setSubject("");
        emailMessage.setContent("");

        exam = new US_103_ExamPOJO();
        exam.setId("6652613812d84a691b4e3ba4");
        exam.setName("Math_Algebla");
        exam.setTranslateName(new String[]{});
        exam.setSchool("6576fd8f8af7ce488ac69b89");
        exam.setGradeLevel(gradeLevel);
        exam.setAcademicPeriod("6577022e8af7ce488ac69b96");
        exam.setActive(true);
        exam.setDescription("");
        exam.setNote("");
        exam.setAgreementText("");
        exam.setSendSMS(false);
        exam.setSms("");
        exam.setSendEmailEnabled(false);
        exam.setEmailMessage(emailMessage);
        exam.setRegistrationStartDate(null);
        exam.setRegistrationEndDate(null);
        exam.setPaid(false);
        exam.setPrice(0);
        exam.setBankAccount(null);
        exam.setSendEmailToRegistrar(false);
        exam.setRegistrarEmails(new String[]{});
        exam.setShowDescFirst(false);
        exam.setShowNoteFirst(false);
        exam.setNoteEnabled(false);
        exam.setDescEnabled(false);
        exam.setAgreementEnabled(false);
        exam.setDocuments(new String[]{});

        response = given()
                .spec(requestSpec)
                .body(exam)
                .when()
                .put("/school-service/api/exams")
                .then()
                .statusCode(200)
                .spec(responseSpec)
                .extract().response();
    }

   /* @Test(dependsOnMethods = "UpdateExam")
    public  void deleteExam(){
        given()
                .spec(requestSpec)
                .pathParam("examId", response.jsonPath().getString("id"))
                .when()
                .delete("/school-service/api/exams/{examId}")
                .then()
                .statusCode(404)
                .extract().response();
    }

    */
    }

