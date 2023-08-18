import javax.swing.*;

public class SearchWindow {
    public static JFrame searchWindow;
    public static JTextField makeText, modelText, yearText;

    public JComboBox<String> color = new JComboBox<>();
    public static JRadioButton gasCar = new JRadioButton("Gas");
    public JRadioButton electricCar = new JRadioButton("Electric");
    public JRadioButton hybridCar = new JRadioButton("Hybrid");
    public JButton saveButton = new JButton("Save");
    public JButton searchButton = new JButton("Search");
    public JButton returnButton = new JButton("Return");

    public SearchWindow() {
        searchCar();
    }
    private void searchCar() {
        searchWindow = new JFrame("Car Main Page - Select Car");

        JLabel makeLabel = new JLabel("Make: ");
        searchWindow.add(makeLabel);
        makeLabel.setBounds(10,5,50,25);

        makeText = new JTextField();
        searchWindow.add(makeText);
        makeText.setBounds(60,5,100,25);

        JLabel modelLabel = new JLabel("Model: ");
        searchWindow.add(modelLabel);
        modelLabel.setBounds(10,50,50,25);

        modelText = new JTextField();
        searchWindow.add(modelText);
        modelText.setBounds(60,50,100,25);

        JLabel yearLabel = new JLabel("Year: ");
        searchWindow.add(yearLabel);
        yearLabel.setBounds(10,100,50,25);

        yearText = new JTextField();
        searchWindow.add(yearText);
        yearText.setBounds(60,100,100,25);


        JLabel colorLabel = new JLabel("Color");
        searchWindow.add(colorLabel);
        colorLabel.setBounds(250,40,50,25);

        color.setModel(new DefaultComboBoxModel<>(new String[] {"Red", "Blue", "Black", "White", "Silver", "Gray"}));
        searchWindow.add(color);
        color.setBounds(250,60,70,25);

        gasCar.setBounds(200,5,60,25);
        electricCar.setBounds(260,5,80,25);
        hybridCar.setBounds(340,5,80,25);

        saveButton.setBounds(20,200,100,40);
        searchButton.setBounds(170,200,100,40);
        returnButton.setBounds(320,200,100,40);

        searchWindow.add(gasCar);
        searchWindow.add(electricCar);
        searchWindow.add(hybridCar);

        searchWindow.add(saveButton);
        searchWindow.add(searchButton);
        searchWindow.add(returnButton);

        searchWindow.setSize(600,400);
        searchWindow.setLayout(null);
        searchWindow.setLocationRelativeTo(null);
        searchWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}