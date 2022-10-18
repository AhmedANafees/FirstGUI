
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author nafea8846
 */
public class FirstGUI  implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;
  JLabel firstNumLabel;
  JTextField firstNumber;
  
  JLabel secondNumLabel;
  JTextField secondNumber;
  
  JLabel resultLabel;
  JTextField result;
  
  JButton addButton;

  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Adding Machine");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);
    
    //create the panel to put things on
    mainPanel = new JPanel();
    mainPanel.setLayout(null);
    
    //create the first Jlabel for the first number
    firstNumLabel = new JLabel("First Number: ");
    //set the x,y position and the width height
    firstNumLabel.setBounds(100, 150, 100, 50);
    
    //create the first JTextField for the first number
    firstNumber = new JTextField();
    //set the x,y position and the width height
    firstNumber.setBounds(200, 150, 100, 50);
    
    secondNumLabel = new JLabel("Second Number: ");
    secondNumLabel.setBounds(75, 250, 100, 50);
    
    secondNumber = new JTextField();
    secondNumber.setBounds(200, 250, 100, 50);
    
    resultLabel = new JLabel("Result: ");
    resultLabel.setBounds(100, 350, 100, 50);
    
    result = new JTextField();
    result.setBounds(200, 350, 100, 50);
    
    //create the button
    addButton = new JButton("add");
    addButton.setBounds(100, 450, 100, 50);
    //make button listen to us
    addButton.addActionListener(this);
    addButton.setActionCommand("add");
    
    //add the label to the panel
    mainPanel.add(firstNumLabel);
    mainPanel.add(firstNumber);
    mainPanel.add(secondNumLabel);
    mainPanel.add(secondNumber);
    mainPanel.add(resultLabel);
    mainPanel.add(result);
    mainPanel.add(addButton);
    //put the panel in the frame
    frame.add(mainPanel);
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();
if(command.equals("add"))
{
String firstBox = firstNumber.getText();
String secondBox = secondNumber.getText();

double num1Double = Double.parseDouble(firstBox);
int num1 = Integer.parseInt(firstBox);
int num2 = Integer.parseInt(secondBox);
int total = num1+num2;

result.setText(" " + total);
}  
    }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    FirstGUI  gui = new FirstGUI ();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}

