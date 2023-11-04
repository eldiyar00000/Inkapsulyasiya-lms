public class Person {
    String name;
    String organy;
    int age;

    public Person(String name, String organy, int age) {
        this.name = name;
        this.organy = organy;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOrgany() {
        return organy;
    }
    public void setOrgany() {
        this.organy = organy;
    }
    public int getAge() {
        return age;
    }
//    public void setAge() {
//        this.age = age;
//    }
    public String getInfoJava() {
        return STR."""
                NAME: \{name }
                ORGANY: \{organy }
                AGE: \{age }
                """;
    }
}
