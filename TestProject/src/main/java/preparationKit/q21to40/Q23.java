package preparationKit.q21to40;

public class Q23 {
}

class Person {
    String name;
    int age =25;

    public Person () {

    }

    public  Person(String name){
        this(); // line n1
        setName(name);

    }

    public Person(String name, int age){
        this(name); // line n2
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

    public  String show(){
        return  name +" "+ +age;

    }

    public static void main(String[] args) {
        Person p1 =new Person("Jesse");
    }
}
