import javax.swing.*;

public class FoundCarFrame {
    public JFrame foundFrame = new JFrame("Car  - Found car");
    public JButton returnButton = new JButton("Return");
    public 	JTextArea displayText = new JTextArea();

    public FoundCarFrame() {
        search();
    }
    private void search() {

        JLabel allCars = new JLabel("Searched Car");
        allCars.setBounds(5,5,100,30);
        foundFrame.add(allCars);

        displayText.setBounds(10,40,670,500);
        foundFrame.add(displayText);

        foundFrame.add(returnButton);
        returnButton.setBounds(580,550,100,50);

        foundFrame.setSize(700,650);
        foundFrame.setLayout(null);
        foundFrame.setLocationRelativeTo(null);
        displayText.setEditable(false);
        foundFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}