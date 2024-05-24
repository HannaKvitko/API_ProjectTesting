package POJO_Models;

public class StatePOJO {

        private String id;
        private String name;
        private String shortName;
        private CountryPOJO country;
        private String[] translateName = {};

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

        public String getShortName() {
                return shortName;
        }

        public void setShortName(String shortName) {
                this.shortName = shortName;
        }

        public CountryPOJO getCountry() {
                return country;
        }

        public void setCountry(CountryPOJO country) {
                this.country = country;
        }

        public String[] getTranslateName() {
                return translateName;
        }

        public void setTranslateName(String[] translateName) {
                this.translateName = translateName;
        }

        @Override
        public String toString() {
                return "StatePOJO{" +
                        "id='" + id + '\'' +
                        ", name='" + name + '\'' +
                        ", shortName='" + shortName + '\'' +
                        ", country=" + country +
                        ", translateName=" + String.join(", ", translateName) +
                        '}';
        }

        //-------------------------------------------- this with a teacher
//        private String id;
//        private String name;
//        private String shortName;
//        private CountryPOJO country;
//        private String[] translateName = {};
//
//        public String getId() {
//                return id;
//        }
//
//        public void setId(String id) {
//                this.id = id;
//        }
//
//        public String getName() {
//                return name;
//        }
//
//        public void setName(String name) {
//                this.name = name;
//        }
//
//        public String getShortName() {
//                return shortName;
//        }
//
//        public void setShortName(String shortName) {
//                this.shortName = shortName;
//        }
//
//        public CountryPOJO getCountry() {
//                return country;
//        }
//
//        public void setCountry(CountryPOJO country) {
//                this.country = country;
//        }
//
//        public String[] getTranslateName() {
//                return translateName;
//        }
//
//        public void setTranslateName(String[] translateName) {
//                this.translateName = translateName;
//        }
}
