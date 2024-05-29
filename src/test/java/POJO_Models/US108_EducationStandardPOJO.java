package POJO_Models;

public class US108_EducationStandardPOJO {
    /*
        "id": "6657294eeae57173361ff250",
            "name": "Khalid",
            "description": "Ahmed",
            "schoolId": "6576fd8f8af7ce488ac69b89"
     */

     private  int id;

     private  String name;

    private String description;

    private  String schoolId;

    public US108_EducationStandardPOJO(int id, String name, String description, String schoolId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.schoolId = schoolId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String  getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String  schoolId) {
        this.schoolId = schoolId;
    }

    public US108_EducationStandardPOJO() {
    }
}
