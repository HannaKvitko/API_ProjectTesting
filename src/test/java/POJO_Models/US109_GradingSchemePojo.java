package POJO_Models;

public class US109_GradingSchemePojo {
    /*
    {
    "name": "hamzagsChampionnns",
    "active": true,
    "schoolId":"6576fd8f8af7ce488ac69b89",
    "gradeRanges": [],
    "type": "POINT",
    "enablePoint": false,
    "minPointToPass": 24
}
     */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
    private String name;
    private boolean active;
    private String schoolId;
    private String[] gradeRanges = {};
    private String type;
    private boolean enablePoint;
    private int minPointToPass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String[] getGradeRanges() {
        return gradeRanges;
    }

    public void setGradeRanges(String[] gradeRanges) {
        this.gradeRanges = gradeRanges;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEnablePoint() {
        return enablePoint;
    }

    public void setEnablePoint(boolean enablePoint) {
        this.enablePoint = enablePoint;
    }

    public int getMinPointToPass() {
        return minPointToPass;
    }

    public void setMinPointToPass(int minPointToPass) {
        this.minPointToPass = minPointToPass;
    }



}
