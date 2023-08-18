import javax.swing.*;
import java.io.*;
import java.util.Arrays;

public class SelectFrame {
    public  JFrame carSelectFrame = new JFrame("Car Main Page - Edit Car");
    public static JTextField carVin;

    public static JRadioButton gasCar = new JRadioButton("Gas");
    public JRadioButton electricCar = new JRadioButton("Electric");
    public JRadioButton hybridCar = new JRadioButton("Hybrid");
    public JButton searchButton = new JButton("Search");
    public JButton deleteButton = new JButton("Delete");
    public JButton returnButton = new JButton("Return");


    public SelectFrame() {
        searchCar();
    }

    private void searchCar() {

        JLabel vinLabel = new JLabel("Vin Number Id ");
        carSelectFrame.add(vinLabel);
        vinLabel.setBounds(180,30,150,25);

        carVin = new JTextField();
        carSelectFrame.add(carVin);
        carVin.setBounds(100,60,250,25);

        searchButton.setBounds(20,150,100,40);
        deleteButton.setBounds(170,150,100,40);
        returnButton.setBounds(320,150,100,40);

        carSelectFrame.add(searchButton);
        carSelectFrame.add(deleteButton);
        carSelectFrame.add(returnButton);

        carSelectFrame.setSize(450,350);
        carSelectFrame.setLayout(null);
        carSelectFrame.setLocationRelativeTo(null);
        carSelectFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public String data(){
        String file = "C:\\Users\\Gemec\\Desktop\\Final Project.txt";
        StringBuilder str = new StringBuilder();
        int i;
        try {
            FileInputStream fIn = new FileInputStream(file);
            BufferedInputStream bIn = new BufferedInputStream(fIn);
            while ((i = bIn.read()) != -1){
                str.append((char) i);
            }
            bIn.close();
            fIn.close();
        }catch (Exception j){System.out.println("Error5" + j);}
        return str.toString();
    }

    int count = 0;
    public void edit() {
        String[] arr = data().split("\n");
        StringBuilder d = new StringBuilder();
        for (String value : arr) {
            d.append(value);
        }
        String[] newArray = d.toString().split(",");

        for (String s : newArray) {
            if ((s.trim().equals(carVin.getText().trim()))) {
                count++;
                break;
            }
        }

            if (carVin.getText().isEmpty() || carVin.getText().isBlank()) {
                JOptionPane.showMessageDialog(carVin, "Vin number can not be blank");
                carVin.setText("");
            } else if (count >0) {
                JOptionPane.showMessageDialog(carVin, "car found");
            }
            else {
                JOptionPane.showMessageDialog(carVin, "car not found");
                carVin.setText("");
            }
    }

    public void delete(){

        deleteButton.addActionListener(e -> {

                if (carVin.getText().isEmpty() || carVin.getText().isBlank()) {
                    JOptionPane.showMessageDialog(carVin, "Car id can not be blank");

                } else if (count>0) {
                    DeleteCarRecord.removeRecord("C:\\Users\\Gemec\\Desktop\\Final Project.txt",
                            SelectFrame.carVin.getText(),1,",");
                    JOptionPane.showMessageDialog(carVin, "Car deleted");
                    carVin.setText("");

                }else {
                    JOptionPane.showMessageDialog(carVin, "Car not found");
                    carVin.setText("");
                }
        });
    }

    public void selectFrameAction(){
        gasCar.addActionListener(e -> {
            electricCar.setSelected(false);
            hybridCar.setSelected(false);
        });
        electricCar.addActionListener(e -> {
            gasCar.setSelected(false);
            hybridCar.setSelected(false);

        });
        hybridCar.addActionListener(e -> {
            hybridCar.setSelected(true);
            gasCar.setSelected(false);
            electricCar.setSelected(false);
        });

        searchButton.addActionListener(e -> {
            edit();
        });
    }
}