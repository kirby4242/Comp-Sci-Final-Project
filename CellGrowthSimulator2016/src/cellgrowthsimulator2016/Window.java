/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellgrowthsimulator2016;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.SpringLayout;

/**
 *
 * @author Sio
 * @author Kirby4242
 */
public class Window extends JFrame{
    private int WIDTH;
    private int HEIGHT;
    JLabel temp;
    JLabel sunlight;
    JLabel food;
    JLabel pH;
    JLabel predators;
    JLabel salt;
    JLabel pollution;
    JLabel radiation;
    
    
    public Window(int x){
        super("Cell Growth Simulator 2016");
        WIDTH = x;
        HEIGHT = WIDTH*9/15-20;
        
        this.createWindow();
    }
    public Window(){}
    
    private void createWindow(){
        Window frame = new Window();
        
        frame.setSize(new Dimension(WIDTH,HEIGHT));
        //Initialize Layers
        JLayeredPane layers = frame.getLayeredPane();
        
        
        SpringLayout layout = new SpringLayout();                               // New layout, look up tutorial to use it. 
        layers.setLayout(layout);
        
        //Sets background image
        JLabel background = new JLabel(new ImageIcon("resources/background.png"));  // Use this method to load images
        layers.add(background, new Integer(1));
        layout.putConstraint(SpringLayout.WEST, background, 0, SpringLayout.WEST, frame);
        layout.putConstraint(SpringLayout.NORTH, background, 0, SpringLayout.NORTH, frame);
        
        //Initializes and sets initial values
        temp = new JLabel("<html> <font color='white'; size='8'> 20° </font></html>");
        sunlight = new JLabel("<html> <font color='white'; size='8'> 3 </font></html>");
        food = new JLabel("<html> <font color='white'; size='8'> 1 </font></html>");;
        pH = new JLabel("<html> <font color='white'; size='8'> 7.0 </font></html>");
        predators = new JLabel("<html> <font color='white'; size='8'> 0 </font></html>");
        salt = new JLabel("<html> <font color='white'; size='8'> 0 </font></html>");
        pollution = new JLabel("<html> <font color='white'; size='8'> 0 </font></html>");
        radiation = new JLabel("<html> <font color='white'; size='8'> 0.0% </font></html>");
        
        layers.add(temp, new Integer(3));
        layers.add(sunlight, new Integer(3));
        layers.add(food, new Integer(3));
        layers.add(pH, new Integer(3));
        layers.add(predators, new Integer(3));
        layers.add(salt, new Integer(3));
        layers.add(pollution, new Integer(3));
        layers.add(radiation, new Integer(3));
        
        //Place them on the screen
        layout.putConstraint(SpringLayout.NORTH, temp, 355, SpringLayout.NORTH, frame);
        layout.putConstraint(SpringLayout.WEST, temp, 110, SpringLayout.WEST, frame);
        layout.putConstraint(SpringLayout.NORTH, sunlight, 400, SpringLayout.NORTH, frame);
        layout.putConstraint(SpringLayout.WEST, sunlight, 110, SpringLayout.WEST, frame);
        layout.putConstraint(SpringLayout.NORTH, food, 450, SpringLayout.NORTH, frame);
        layout.putConstraint(SpringLayout.WEST, food, 110, SpringLayout.WEST, frame);
        layout.putConstraint(SpringLayout.NORTH, pH, 500, SpringLayout.NORTH, frame);
        layout.putConstraint(SpringLayout.WEST, pH, 110, SpringLayout.WEST, frame);
        layout.putConstraint(SpringLayout.NORTH, predators, 545, SpringLayout.NORTH, frame);
        layout.putConstraint(SpringLayout.WEST, predators, 155, SpringLayout.WEST, frame);
        layout.putConstraint(SpringLayout.NORTH, salt, 590, SpringLayout.NORTH, frame);
        layout.putConstraint(SpringLayout.WEST, salt, 110, SpringLayout.WEST, frame);
        layout.putConstraint(SpringLayout.NORTH, pollution, 630, SpringLayout.NORTH, frame);
        layout.putConstraint(SpringLayout.WEST, pollution, 155, SpringLayout.WEST, frame);
        layout.putConstraint(SpringLayout.NORTH, predators, 545, SpringLayout.NORTH, frame);
        layout.putConstraint(SpringLayout.WEST, predators, 155, SpringLayout.WEST, frame);
        layout.putConstraint(SpringLayout.NORTH, radiation, 675, SpringLayout.NORTH, frame);
        layout.putConstraint(SpringLayout.WEST, radiation, 120, SpringLayout.WEST, frame);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    public void update(Environment e){                                                       //updates after something happens
        //Set values
        temp.setText(Integer.toString(e.temp));
        sunlight.setText(Integer.toString(e.sunlight));
        food.setText(Integer.toString(e.food));
        pH.setText(Double.toString(e.pH));
        predators.setText(Integer.toString(e.predators));
        pollution.setText(Integer.toString(e.pollution));
        radiation.setText(Double.toString(e.radiation));
        
    }
    
}
