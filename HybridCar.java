public class HybridCar extends Car{
    private String batteryType;
    private int batterySize;
    private String fuelType;
    private double tankSize;

    public HybridCar(){}
    public HybridCar(String make, String model, int year, String colour, int weight,
                     String batteryType, int batterySize, String fuelType, double tankSize) {
        super(make, model, year, colour, weight);
        this.batteryType = batteryType;
        this.batterySize = batterySize;
        this.fuelType = fuelType;
        this.tankSize = tankSize;
    }
    @Override
    public String toString() {
        return AddCarFrame.vinText.getText() + "," + "GasCar fuelType: " + fuelType + ",tankSize: " + tankSize + "," +
                "ElectricGas batteryType: " + batteryType + ",batterySize: " + batterySize + "," + super.toString()+ ",";
    }
}
