import javax.swing.*;
import java.awt.*;
public class CarDisplayFrame {
    public JFrame carDisplayFrame;
    public JButton returnButton = new JButton("Return");
    public 	JTextArea displayText = new JTextArea();
    public JButton exitButton = new JButton("Exit");

    public CarDisplayFrame() {
        display();
    }

    private void display() {
        carDisplayFrame = new JFrame();
        carDisplayFrame.setTitle("Car Main - Car Display");
        carDisplayFrame.setSize(700,500);
        carDisplayFrame.setLocationRelativeTo(null);
        carDisplayFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        carDisplayFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        displayText.setEditable(false);

        carDisplayFrame.add(displayText);
        carDisplayFrame.add(returnButton);
        carDisplayFrame.add(exitButton);
    }
}