package POJO_Models;

public class US_102_CitiesPOJO {
    /* {  "id": null,
    "name": "Lunariym",
    "country": {
        "id": "62fe59b63524797773da0531"
    },
    "state": null,
    "translateName": []
}   */
    private String id;
    private String name;
    private CountryPOJO country;
    private String state;
    private String[] translateName = {};

    public String getId() {
        return id;
    }

    public CountryPOJO getCountry() {
        return country;
    }

    public void setCountry(CountryPOJO country) {
        this.country = country;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String[] getTranslateName() {
        return translateName;
    }

    public void setTranslateName(String[] translateName) {
        this.translateName = translateName;
    }
}
