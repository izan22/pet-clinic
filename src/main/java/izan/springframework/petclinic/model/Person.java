package izan.springframework.petclinic.model;

public abstract class Person {

    private String name;
    private String lastName;

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
