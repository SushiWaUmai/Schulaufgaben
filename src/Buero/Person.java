public class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public String toString() {
        return "Person: " + name;
    }
}