package q91to100;

public class Q95 {
    Car c1 = new Car("Auto");
    Car c2 = new Car("W4", 150, "Manuel");
}

class Vehicle {
    String type = "4W";
    int maxSpeed = 100;

    Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}

class Car extends Vehicle {
    String trans;

    Car(String trans) {
        super("W4", 100);
        this.trans = trans;
    }

    Car(String type, int maxSpeed, String trans) {
        super(type, maxSpeed);
//        this(trans);
    }
}