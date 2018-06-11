public class CarApp {

    public static void main(String[] args) {
	// Create two instances of cars
        Car porsche = new Car (90, "Porsche", "red");
        Car honda = new Car (50, "Honda", "blue");

    // Call the methods for each car one after the other
        System.out.println(porsche.start());
        System.out.println(honda.start());
        System.out.println(porsche.accelerate());
        System.out.println(honda.accelerate());
        System.out.println(porsche.stop());
        System.out.println(honda.currentSpeed());
        System.out.println(porsche.start());
        System.out.println(honda.accelerate());
        System.out.println(porsche.stop());
        System.out.println(honda.currentSpeed());
        System.out.println(porsche.currentSpeed());
        System.out.println(honda.stop());
        System.out.println(porsche.stop());
    }
}
