public class Car extends Vehicle {

    //instance variables
    private String make;
    private String color;

    //constructors
    public Car () {}

    public Car (int speed, String make, String color) {
        super (speed);
        this.make = make;
        this.color = color;
    }

    //instance methods
    public String start () {
        return "The " + color + " " + make + " is starting";
    }

    public String accelerate () {
        return "The " + color + " " + make + " is accelerating";
    }

    public String currentSpeed () {
        return "The " + color + " " + make + " is going " + super.speed +
                " " + "mph";
    }
    public String stop () {
        return "The " + color + " " + make + " is stopped";
    }
}
