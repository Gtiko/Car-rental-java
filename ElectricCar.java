public class ElectricCar extends Car{
    private String batteryType;
    private int batterySize;

    public ElectricCar(){}
    public ElectricCar(String make, String model, int year, String colour, int weight,
                       String batteryType, int batterySize) {
        super(make, model, year, colour,weight);
        this.batteryType = batteryType;
        this.batterySize = batterySize;
    }

    @Override
    public String toString() {
        return AddCarFrame.vinText.getText()  + "," + "ElectricGas batteryType: " +
                batteryType + ",batterySize: " + batterySize + "," + super.toString()+ ",";
    }
}