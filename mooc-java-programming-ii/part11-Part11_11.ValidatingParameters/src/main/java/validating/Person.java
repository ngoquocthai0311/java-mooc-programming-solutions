package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {        
        String regxName = "^[(A-Z|a-z)]{1,40}$";
        String regxAge = "^([0-9]|[0-9][0-9]|[1][0][0-9]|[1][1][0-9]|120)$";
        // throw an exception 
        if (name == null || !(name.matches(regxName)) || !(String.valueOf(age).matches(regxAge))) {
            throw new IllegalArgumentException("Invalid name or age");
        }     
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
