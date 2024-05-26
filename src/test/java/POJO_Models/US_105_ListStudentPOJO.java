package POJO_Models;

public class US_105_ListStudentPOJO {

    private String id;
    private String SchoolId;
    private String name;
    private String description;
    private int count;

    private boolean active;

    private boolean publicGroup;

    private boolean showToStudent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolId() {
        return SchoolId;
    }

    public void setSchoolId(String schoolId) {
        SchoolId = schoolId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isPublicGroup() {
        return publicGroup;
    }

    public void setPublicGroup(boolean publicGroup) {
        this.publicGroup = publicGroup;
    }

    public boolean isShowToStudent() {
        return showToStudent;
    }

    public void setShowToStudent(boolean showToStudent) {
        this.showToStudent = showToStudent;
    }
}
