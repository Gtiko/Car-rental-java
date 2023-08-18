public class Car{
    private String make;
    private String model;
    private int year;
    private String colour;
    private int weight;
    public Car(){}
    public Car(String make, String model, int year, String colour,int weight) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car make: " + make + ",model: " + model + ",year: " + year + ",colour: " + colour + ",weight: " + weight + ",";
    }
}