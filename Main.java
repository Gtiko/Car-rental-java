import java.util.*;
import java.io.*;
import java.awt.EventQueue;

public class Main {
    public static CarFrame carFrame = new CarFrame();
    public static AddCarFrame addCarFrame = new AddCarFrame();
    public static CarDisplayFrame carDisplayFrame = new CarDisplayFrame();
    public static SelectFrame selectFrame = new SelectFrame();
    public static DisplayAllCarsFrame displayAllCarsFrame = new DisplayAllCarsFrame();
    public static FoundCarFrame foundCarFrame = new FoundCarFrame();

    public static List<Car> cars = new ArrayList<>();

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    carFrame.carFrame.setVisible(true);
                } catch (Exception e) {System.out.println("Error1");}

/** @ Main Frame ***/  {
//display button
                    carFrame.displayButton.addActionListener(e -> {
                        carDisplayFrame.carDisplayFrame.setVisible(true);
                        AddCarFrame.addCarFrame.setVisible(false);

                        StringBuilder display = new StringBuilder();
                        for (Car c : cars) {
                            display.append(c.toString()).append("\n");
                        }
                        carDisplayFrame.displayText.setText(display.toString());
                    });
//add car button
                    carFrame.addButton.addActionListener(e -> {
                        carFrame.carFrame.setVisible(false);
                        AddCarFrame.addCarFrame.setVisible(true);
                    });
//select car button
                    carFrame.selectButton.addActionListener(e -> {
                        carFrame.carFrame.setVisible(false);
                        selectFrame.carSelectFrame.setVisible(true);
                    });
//display button
                    carFrame.displayAllCars.addActionListener(e -> {
                        displayAllCarsFrame.displayAllCars.setVisible(true);
                        selectFrame.carSelectFrame.setVisible(false);
                        String file = "C:\\Users\\Gemec\\Desktop\\Final Project.txt";
                        StringBuilder str = new StringBuilder();
                        int i;
                        try {
                            FileInputStream fIn = new FileInputStream(file);
                            BufferedInputStream bIn = new BufferedInputStream(fIn);
                            while ((i = bIn.read()) != -1) {
                                str.append((char) i);
                            }
                            bIn.close();
                            fIn.close();
                        } catch (Exception j) {
                            System.out.println("Error5" + j);
                        }
                        displayAllCarsFrame.displayText.setText(str.toString());
                    });
                }
/***  End of Main Frame ******/


/*****  @ Add Frame ***/
                {
                    addCarFrame.addActions();
//return add car
                }

/*****  @ End of Add Frame ***/


/*** @  Select Frame *******/
                {
//delete car
                    selectFrame.delete();
                    selectFrame.selectFrameAction();
                }
/*** @ End of Select Frame *******/


/** Exit & return buttons**/
//exit button car display
                carDisplayFrame.exitButton.addActionListener(e -> closeApp());
//Car Main exit button
                carFrame.exitButton.addActionListener(e -> closeApp());
//return button car display
                carDisplayFrame.returnButton.addActionListener(e -> {
                    carDisplayFrame.carDisplayFrame.setVisible(false);
                    carFrame.carFrame.setVisible(true);
                });
//return button car select frame
                selectFrame.returnButton.addActionListener(e -> {
                    selectFrame.carSelectFrame.setVisible(false);
                    carFrame.carFrame.setVisible(true);
                });
//return button for display all
                displayAllCarsFrame.returnButton.addActionListener(e -> {
                    displayAllCarsFrame.displayAllCars.setVisible(false);
                    carFrame.carFrame.setVisible(true);
                });
//return button for add frame
                addCarFrame.returnButton.addActionListener(e -> {
                    carFrame.carFrame.setVisible(true);
                    AddCarFrame.addCarFrame.setVisible(false);
                });
//return button for found frame
                foundCarFrame.returnButton.addActionListener(e -> {
                    foundCarFrame.foundFrame.setVisible(false);
                    carFrame.carFrame.setVisible(true);
                });
            }
            void closeApp() {
                StringBuilder text = new StringBuilder();
                for (Car v : cars){
                    text.append(v);
                }
                try {
                    FileOutputStream fs = new FileOutputStream("C:\\Users\\Gemec\\Desktop\\Final Project.txt",true);
                    BufferedOutputStream bOut = new BufferedOutputStream(fs);
                    String z = "\n" + text;
                    byte [] b = (z).getBytes();
                    bOut.write(b);
                    bOut.flush();
                    bOut.close();
                    fs.close();
                } catch(IOException e) {e.printStackTrace();}
                System.exit(0);
            }
        });
    }
}
