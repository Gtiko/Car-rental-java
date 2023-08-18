import javax.swing.*;
public class DisplayAllCarsFrame {
    public JFrame displayAllCars = new JFrame("Car  - All cars");
    public JButton returnButton = new JButton("Return");
    public 	JTextArea displayText = new JTextArea();

    public DisplayAllCarsFrame() {
        search();
    }
    private void search() {

        JLabel allCars = new JLabel("All cars");
        allCars.setBounds(5,5,100,30);
        displayAllCars.add(allCars);

        displayText.setBounds(10,40,670,500);
        displayAllCars.add(displayText);

        displayAllCars.add(returnButton);
        returnButton.setBounds(580,550,100,50);

        displayAllCars.setSize(700,650);
        displayAllCars.setLayout(null);
        displayAllCars.setLocationRelativeTo(null);
        displayText.setEditable(false);
        displayAllCars.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}