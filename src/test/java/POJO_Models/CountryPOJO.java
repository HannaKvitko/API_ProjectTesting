package POJO_Models;

public class CountryPOJO {
    private String id;
    private String name;
    private String shortName;
    private String code;
    private String[] translateName = {};
    private boolean hasState;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String[] getTranslateName() {
        return translateName;
    }

    public void setTranslateName(String[] translateName) {
        this.translateName = translateName;
    }

    public boolean isHasState() {
        return hasState;
    }

    public void setHasState(boolean hasState) {
        this.hasState = hasState;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}
