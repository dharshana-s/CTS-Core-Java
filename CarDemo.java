class Car {
    String make, model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2022);
        car1.displayDetails();
    }
}