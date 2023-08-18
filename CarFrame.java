import javax.swing.*;
import java.awt.*;

public class CarFrame {
    public JFrame carFrame;
    public JButton displayButton, addButton, exitButton, selectButton, displayAllCars;

    public CarFrame() {
        mainFrame();
    }
    private void mainFrame() {
        carFrame = new JFrame();
        carFrame.setTitle("Car Registration Form");

/////////////////////////////////////////////////////////////
        JLabel title = new JLabel("ABC Car Dealership LLC\n Inventory Control System");
        title.setBounds(10,10,700,30);
        title.setForeground(Color.BLACK);
        title.setFont(new Font("Cambria",1,25));
        carFrame.add(title);

        JLabel address = new JLabel("1000 N Main st, FairFiled 52556, IA");
        address.setBounds(10,25,400,50);
        address.setForeground(Color.BLACK);
        address.setFont(new Font("Cambria",1,15));
        carFrame.add(address);

        JLabel email = new JLabel("abc@gmail.com");
        email.setBounds(10,40,400,50);
        email.setForeground(Color.BLACK);
        email.setFont(new Font("TimesNewRoman",1,15));
        carFrame.add(email);

        JLabel Label = new JLabel();
        JScrollPane pic1 = new JScrollPane();
        Label.setIcon(new ImageIcon("pic1.png"));
        pic1.setViewportView(Label);
        carFrame.add(Label);
        Label.setVisible(true);
        Label.setBounds(100,-50,700,500);

//////////////////////////////////////////////////////////////////////

        addButton = new JButton("Add Cars");
        addButton.setBounds(20,300,170,60);
        carFrame.add(addButton);

        displayButton = new JButton("New Registered Cars");
        displayButton.setBounds(230,300,170,60);
        carFrame.add(displayButton);

        selectButton = new JButton("Edit Car");
        selectButton.setBounds(450,300,170,60);
        carFrame.add(selectButton);

        displayAllCars = new JButton("Car Inventory Report");
        displayAllCars.setBounds(20,400,250,60);
        carFrame.add(displayAllCars);

        exitButton = new JButton("Exit");
        exitButton.setBounds(375,400,250,60);
        carFrame.add(exitButton);

        carFrame.setSize(700,500);
        carFrame.setLayout(null);
        carFrame.setVisible(true);
        carFrame.setLocationRelativeTo(null);
        carFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}