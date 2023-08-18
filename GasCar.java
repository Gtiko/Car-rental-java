public class GasCar extends Car{
    private String fuelType;
    private double tankSize;

    public GasCar(){}
    public GasCar(String make, String model, int year, String colour, int weight, String fuelType, double tankSize) {
        super(make, model, year, colour,weight);
        this.fuelType = fuelType;
        this.tankSize = tankSize;
    }

    @Override
    public String toString() {
        return AddCarFrame.vinText.getText() + "," +"GasCar fuelType: " +
                fuelType + ",tankSize: " + tankSize + "," + super.toString()+ ",";
    }
}