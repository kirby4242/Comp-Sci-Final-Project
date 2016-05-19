/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellgrowthsimulator2016;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.SpringLayout;

import cards.*;
/**
 *
 * @author Sio
 * @author Kirby4242
 * @author BreadnButter
 */
public class Window extends JFrame {
    private int WIDTH;          // width and height of window
    private int HEIGHT;
    static JLabel temp;
    static JLabel sunlight;               // all of these are Jlabels which will be printed out onto the cell
    static JLabel food;
    static JLabel pH;
    static JLabel predators;
    static JLabel salt;
    static JLabel pollution;
    static JLabel radiation;
    static JLabel size;
    static JLabel turn;
    static JLabel card1 = new JLabel();                  // creates the cards that will be seen onscreen
    static JLabel card2 = new JLabel();
    static JLabel tlCell = new JLabel();
    static JLabel beginningCell = new JLabel();
    static Hand h = new Hand();                                                       //Creates hand
    Environment e = new Environment();                                          //Don't call this, just called for the constructor
    public static int radProtection;
    
    
    public Window(int x){              // Constructor which takes in a number makes it the width and scales it approparity
        super("Cell Growth Simulator 2016");             // call to the parent constructor
        WIDTH = x;
        HEIGHT = WIDTH*9/15-20;
        
        this.createWindow();             // order to a method which pretty much uses JFrame to make everything
    }
    public Window(){}


    
    private void createWindow(){
        Window frame = new Window();                                   // constructing a new window object that we call frame
        
        frame.setSize(new Dimension(WIDTH,HEIGHT));                    //sets the size of the game
        //Initialize Layers
        JLayeredPane layers = frame.getLayeredPane();                  
        
        
        SpringLayout layout = new SpringLayout();                               // New layout, look up tutorial to use it. 
        layers.setLayout(layout);
        
        //Sets background image
        JLabel background = new JLabel(new ImageIcon("resources/background.png"));  // Use this method to load images
        layers.add(background, new Integer(1));
        layout.putConstraint(SpringLayout.WEST, background, 0, SpringLayout.WEST, frame);                         // this stuff sets limits and displays our backround
        layout.putConstraint(SpringLayout.NORTH, background, 0, SpringLayout.NORTH, frame);
        
        //Initializes and sets initial values
        turn = new JLabel("<html> <font color='white'; size='8'> 1 </font></html>");
        size = new JLabel("<html> <font color='white'; size='8'> 1 </font></html>");
        temp = new JLabel("<html> <font color='white'; size='8'> 20° </font></html>");
        sunlight = new JLabel("<html> <font color='white'; size='8'> 3 </font></html>");
        food = new JLabel("<html> <font color='white'; size='8'> 1 </font></html>");
        pH = new JLabel("<html> <font color='white'; size='8'> 7.0 </font></html>");
        predators = new JLabel("<html> <font color='white'; size='8'> 0 </font></html>");
        salt = new JLabel("<html> <font color='white'; size='8'> 0 </font></html>");
        pollution = new JLabel("<html> <font color='white'; size='8'> 0 </font></html>");
        radiation = new JLabel("<html> <font color='white'; size='8'> 0.0% </font></html>");
        // Amount of radation protection
        radProtection = 0;
        // preps everything so that everything can be put on the screen by adding them to a layout
        layers.add(turn, new Integer(3));
        layers.add(size, new Integer(3));
        layers.add(temp, new Integer(3));
        layers.add(sunlight, new Integer(3));
        layers.add(food, new Integer(3));
        layers.add(pH, new Integer(3));
        layers.add(predators, new Integer(3));
        layers.add(salt, new Integer(3));
        layers.add(pollution, new Integer(3));
        layers.add(radiation, new Integer(3));
        layers.add(card1, new Integer(3));
        layers.add(card2, new Integer(3));
        
        //Place them on the screen
        layout.putConstraint(SpringLayout.NORTH, turn, 305, SpringLayout.NORTH, frame);
        layout.putConstraint(SpringLayout.WEST, turn, 100, SpringLayout.WEST, frame);
        layout.putConstraint(SpringLayout.NORTH, size, 210, SpringLayout.NORTH, frame);
        layout.putConstraint(SpringLayout.WEST, size, 130, SpringLayout.WEST, frame);
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
        // sets the cards to the appropriate image of what is currently in the hand
        card1.setIcon(new ImageIcon(h.hand.get(0).imageAddress));
        card2.setIcon(new ImageIcon(h.hand.get(1).imageAddress));
        
        //add icon cell
        tlCell.setIcon(new ImageIcon("resources/cell.jpg"));
        layers.add(tlCell, new Integer(3));
        layout.putConstraint(SpringLayout.NORTH, tlCell, 60, SpringLayout.NORTH, frame);
        layout.putConstraint(SpringLayout.WEST, tlCell, 40, SpringLayout.WEST, frame);
        
        //add main cells
        beginningCell.setIcon(new ImageIcon("resources/cell.png"));
        layers.add(beginningCell, new Integer(2));
        layout.putConstraint(SpringLayout.NORTH, beginningCell, 100, SpringLayout.NORTH, frame);
        layout.putConstraint(SpringLayout.WEST, beginningCell, 600, SpringLayout.WEST, frame);
        
        
        //Add cards
        layout.putConstraint(SpringLayout.NORTH, card1, 388, SpringLayout.NORTH, frame);
        layout.putConstraint(SpringLayout.WEST, card1, 400, SpringLayout.WEST, frame);
        layout.putConstraint(SpringLayout.NORTH, card2, 388, SpringLayout.NORTH, frame);
        layout.putConstraint(SpringLayout.WEST, card2, 800, SpringLayout.WEST, frame);
        
        // basic stuff that makes things a ton easier
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);  
        // adds Mouse listeners on both of the cards and allows for card differentiation
        card1.addMouseListener(new Mouse(h.hand.get(0)));
        card2.addMouseListener(new Mouse(h.hand.get(1)));
        
        frame.setVisible(true);
    }
    
    public static void update(){                                                       //updates after something happens
        //Set values
        Environment.livable();  //  checks if the environment is livable. Method just force exist if it isnt
        Cell.turn ++;//this goes twice with the double frature cards, 
        if(Environment.food > 1){         // every turn you consume 1 food
            Cell.size++;
            Environment.food--;
        }
        if(Cell.turn%7 == 0){         // every seventh turn radation goes up be 2 and predators by 1
            Environment.radiation += 2.0;
            Environment.predators += 1;
        }
        
        if(Environment.temp<0){           // if temp is less than 0 is sets it to 0
            Environment.setTemp(0);
        }
        if(Environment.food<0){        // food can never go negative
            Environment.setFood(0);
        }
        if(Environment.pH<1){                // this stuff dosent matter cause if it gets this low or high you die
            
            Environment.setPH(1);
        }
        if(Environment.pH>14){
            Environment.setPH(14);
        }
        if(Environment.predators<0){      // predators pollution radiation and salt cant go negative
            Environment.setPred(0);
        }
        if(Environment.pollution<0){
            Environment.setPoll(0);
        }
        if(Environment.salt<0){
            Environment.setSalt(0);
        }
        if(Environment.radiation<0.0){     
            Environment.setRad(0.0);
        }
        
        //check radiation resistance
        if(radProtection > 100){               
            radProtection = 100;
        }
        switch(radProtection){
            case(25):
                Environment.radiation *= 0.75;
            case(50):
                Environment.radiation *= 0.5;
            case(75):
                Environment.radiation *= 0.25;
            case(100):
                Environment.radiation = 0;     // changes rad levers
            default:
                break;
        }
        // sets the updated text
        turn.setText("<html> <font color='white'; size='8'> " + Integer.toString(Cell.turn) + " </font></html>");
        size.setText("<html> <font color='white'; size='8'> " + Integer.toString(Cell.size) + " </font></html>");
        temp.setText("<html> <font color='white'; size='8'> " + Integer.toString(Environment.temp) + "°" + " </font></html>");
        sunlight.setText("<html> <font color='white'; size='8'> " + Integer.toString(Environment.sunlight) + " </font></html>");
        food.setText("<html> <font color='white'; size='8'> " + Integer.toString(Environment.food) + " </font></html>");
        pH.setText("<html> <font color='white'; size='8'> " + Double.toString(Environment.pH) + " </font></html>");
        predators.setText("<html> <font color='white'; size='8'> " + Integer.toString(Environment.predators) + " </font></html>");
        pollution.setText("<html> <font color='white'; size='8'> " + Integer.toString(Environment.pollution) + " </font></html>");
        salt.setText("<html> <font color='white'; size='8'> " + Integer.toString(Environment.salt) + " </font></html>");
        radiation.setText("<html> <font color='white'; size='8'> " + Double.toString(Environment.radiation) + "%" + " </font></html>");
        h = new Hand();
        
        card1.removeMouseListener(card1.getMouseListeners()[0]);//prevent errors
        card2.removeMouseListener(card2.getMouseListeners()[0]);
        // resets Icons and readds mouselisteners
        card1.setIcon(new ImageIcon(h.hand.get(0).imageAddress));
        card2.setIcon(new ImageIcon(h.hand.get(1).imageAddress));
        card1.addMouseListener(new Mouse(h.hand.get(0)));
        card2.addMouseListener(new Mouse(h.hand.get(1)));
    }

}
