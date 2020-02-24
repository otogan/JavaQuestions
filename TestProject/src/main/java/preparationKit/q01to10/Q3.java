package preparationKit.q01to10;

public class Q3 {
    public static void main(String[] args) {

    }
}

class Person {
    String name;
    int age = 25;

    public Person(String name) {
//        this(); // constructor not defined
        setName(name);
    }

    public Person(String name, int age) {
//        Person(name); // must be this(name)
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}