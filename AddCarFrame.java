import javax.swing.*;

public class AddCarFrame {
    public static JFrame addCarFrame;
    public static JTextField makeText, modelText, yearText, weightText, tankSizeText;
    public static JTextField fuelTypeText, batterySizeText, batteryTypeText,vinText;

    public JComboBox<String> color = new JComboBox<>();
    public JRadioButton electricCar = new JRadioButton("Electric");
    public JRadioButton hybridCar = new JRadioButton("Hybrid");
    public static JRadioButton gasCar = new JRadioButton("Gas");
    public JButton saveButton = new JButton("Save");
    public JButton returnButton = new JButton("Return");

    public AddCarFrame() {
        addCars();
    }

    private void addCars() {
        addCarFrame = new JFrame("Car Main Page - Add Car");

        JLabel vinNumber = new JLabel("Car Vin Number");
        addCarFrame.add(vinNumber);
        vinNumber.setBounds(300, 40, 100, 25);

        vinText = new JTextField();
        addCarFrame.add(vinText);
        vinText.setBounds(300, 65, 100, 25);

        JLabel makeLabel = new JLabel("Make: ");
        addCarFrame.add(makeLabel);
        makeLabel.setBounds(10, 5, 50, 25);

        makeText = new JTextField();
        addCarFrame.add(makeText);
        makeText.setBounds(60, 5, 100, 25);

        JLabel modelLabel = new JLabel("Model: ");
        addCarFrame.add(modelLabel);
        modelLabel.setBounds(10, 50, 50, 25);

        modelText = new JTextField();
        addCarFrame.add(modelText);
        modelText.setBounds(60, 50, 100, 25);

        JLabel yearLabel = new JLabel("Year: ");
        addCarFrame.add(yearLabel);
        yearLabel.setBounds(10, 100, 50, 25);

        yearText = new JTextField();
        addCarFrame.add(yearText);
        yearText.setBounds(60, 100, 100, 25);

        JLabel weightLabel = new JLabel("Weight: ");
        addCarFrame.add(weightLabel);
        weightLabel.setBounds(10, 150, 100, 25);

        weightText = new JTextField();
        addCarFrame.add(weightText);
        weightText.setBounds(60, 150, 100, 25);

        JLabel colorLabel = new JLabel("Color");
        addCarFrame.add(colorLabel);
        colorLabel.setBounds(200, 40, 50, 25);

        color.setModel(new DefaultComboBoxModel<>(new String[]{"Yellow", "Gray", "Black", "White", "Silver", "Blue"}));
        addCarFrame.add(color);
        color.setBounds(200, 60, 70, 25);
/////////////////////////////////////////////////////////////////////////
        JLabel tankLabel = new JLabel("Tank Size ");
        addCarFrame.add(tankLabel);
        tankLabel.setBounds(80, 190, 80, 25);

        tankSizeText = new JTextField();
        tankSizeText.setEditable(false);
        addCarFrame.add(tankSizeText);
        tankSizeText.setBounds(40, 215, 150, 25);
/////////////////////////////////////////////////////////////////////////
        JLabel fuelLabel = new JLabel("Fuel Type ");
        addCarFrame.add(fuelLabel);
        fuelLabel.setBounds(300, 190, 80, 25);

        fuelTypeText = new JTextField();
        fuelTypeText.setEditable(false);
        addCarFrame.add(fuelTypeText);
        fuelTypeText.setBounds(260, 215, 150, 25);
///////////////////////////////////////////////////////////////////////////////////
        JLabel batteryLabel = new JLabel("Battery Size ");
        addCarFrame.add(batteryLabel);
        batteryLabel.setBounds(80, 250, 80, 25);

        batterySizeText = new JTextField();
        batterySizeText.setEditable(false);
        addCarFrame.add(batterySizeText);
        batterySizeText.setBounds(40, 275, 150, 25);
///////////////////////////////////////////////////////////////////////////////////
        JLabel batterySizeLabel = new JLabel("Battery Type");
        addCarFrame.add(batterySizeLabel);
        batterySizeLabel.setBounds(300, 250, 80, 25);

        batteryTypeText = new JTextField();
        batteryTypeText.setEditable(false);
        addCarFrame.add(batteryTypeText);
        batteryTypeText.setBounds(260, 270, 150, 25);
/////////////////////////////////////////////////////////////////////////////////////
        gasCar.setBounds(200, 5, 60, 25);
        electricCar.setBounds(260, 5, 80, 25);
        hybridCar.setBounds(340, 5, 80, 25);
/////////////////////////////////////////////////////////////////////////////////////
        saveButton.setBounds(100, 330, 100, 40);
        returnButton.setBounds(250, 330, 100, 40);
/////////////////////////////////////////////////////////////////////////////////////
        addCarFrame.add(gasCar);
        addCarFrame.add(electricCar);
        addCarFrame.add(hybridCar);

        addCarFrame.add(saveButton);
        addCarFrame.add(returnButton);

        addCarFrame.setSize(450, 450);
        addCarFrame.setLayout(null);
        addCarFrame.setLocationRelativeTo(null);
        addCarFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void save() {

        if (AddCarFrame.makeText.getText().isEmpty() || AddCarFrame.makeText.getText().isBlank()) {
            JOptionPane.showMessageDialog(saveButton, "Make can not be blank");
        }

        if (AddCarFrame.modelText.getText().isEmpty()
                || AddCarFrame.modelText.getText().isBlank()) {
            JOptionPane.showMessageDialog(saveButton, "Model can not be blank");
        }
        if (AddCarFrame.vinText.getText().isEmpty()
                || AddCarFrame.vinText.getText().isBlank()) {
            JOptionPane.showMessageDialog(vinText, "Vin number can not be blank");
        }

        if (AddCarFrame.yearText.getText().isEmpty() || AddCarFrame.yearText.getText().isBlank()) {
            JOptionPane.showMessageDialog(saveButton, "Year needs to be numeric");
        }

        int year = 0;
        try {
            year = Integer.parseInt(AddCarFrame.yearText.getText());
        } catch (Exception e1) {
            JOptionPane.showMessageDialog(saveButton, "Year needs to be numeric");
        }
        int weight = 0;
        if (!(AddCarFrame.weightText.getText().isEmpty()
                || AddCarFrame.weightText.getText().isBlank())) {
            try {
                weight = Integer.parseInt(AddCarFrame.weightText.getText());
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(saveButton, "Weight needs to be numeric");
            }
        }
        int tankSize = 0;
        if (!(AddCarFrame.tankSizeText.getText().isEmpty() || AddCarFrame.tankSizeText.getText().isBlank())) {
            try {
                tankSize = Integer.parseInt(AddCarFrame.tankSizeText.getText());
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(saveButton, "Tank size needs to be numeric");
            }
        }
        int batterySize = 0;
        if (!(AddCarFrame.batterySizeText.getText().isEmpty()
                || AddCarFrame.batterySizeText.getText().isBlank())) {
            try {
                batterySize = Integer.parseInt(AddCarFrame.batterySizeText.getText());
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(saveButton, "Year needs to be numeric");
            }
        }
        JOptionPane.showMessageDialog(saveButton, "Submitted Successfully");

        GasCar gasCar = new GasCar(AddCarFrame.makeText.getText(), AddCarFrame.modelText.getText(),
                year, (String) color.getSelectedItem(), weight,
                AddCarFrame.fuelTypeText.getText(), tankSize);

        ElectricCar elcCar = new ElectricCar(AddCarFrame.makeText.getText(),
                AddCarFrame.modelText.getText(), year,
                (String) color.getSelectedItem(), weight,
                AddCarFrame.batteryTypeText.getText(), batterySize);

        HybridCar hyCar = new HybridCar(AddCarFrame.makeText.getText(),
                AddCarFrame.modelText.getText(), year, (String) color.getSelectedItem(), weight,
                AddCarFrame.batteryTypeText.getText(), batterySize, AddCarFrame.fuelTypeText.getText(), tankSize);

//saving the objects to the arraylist
        if (electricCar.isSelected()) {
            Main.cars.add(elcCar);
        } else if (hybridCar.isSelected()) {
            Main.cars.add(hyCar);
        }else if(AddCarFrame.gasCar.isSelected()) {
            Main.cars.add(gasCar);
        }

        AddCarFrame.modelText.setText("");
        AddCarFrame.makeText.setText("");
        AddCarFrame.yearText.setText("");
        AddCarFrame.weightText.setText("");

        AddCarFrame.batterySizeText.setText("");
        AddCarFrame.batteryTypeText.setText("");
        AddCarFrame.fuelTypeText.setText("");
        AddCarFrame.tankSizeText.setText("");
    }

    public void addActions(){
        gasCar.addActionListener(e -> {
            electricCar.setSelected(false);
            hybridCar.setSelected(false);
            batteryTypeText.setEditable(false);
            batterySizeText.setEditable(false);
            fuelTypeText.setEditable(true);
            tankSizeText.setEditable(true);
        });
        electricCar.addActionListener(e -> {
            gasCar.setSelected(false);
            hybridCar.setSelected(false);
            batteryTypeText.setEditable(true);
            batterySizeText.setEditable(true);
            fuelTypeText.setEditable(false);
            tankSizeText.setEditable(false);
        });
        hybridCar.addActionListener(e -> {
            hybridCar.setSelected(true);
            gasCar.setSelected(false);
            electricCar.setSelected(false);
            batteryTypeText.setEditable(true);
            batterySizeText.setEditable(true);
            fuelTypeText.setEditable(true);
            tankSizeText.setEditable(true);
        });
            saveButton.addActionListener(e -> {
            save();
        });
    }
}