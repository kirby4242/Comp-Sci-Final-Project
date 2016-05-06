/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellgrowthsimulator2016;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

/**
 *
 * @author Sio
 */
public class Window extends JFrame{
    private int WIDTH;
    private int HEIGHT;
    
    public Window(int x){
        super("Cell Growth Simulator 2016");
        WIDTH = x;
        HEIGHT = WIDTH*3/4;
        this.createWindow();
    }
    public Window(){}
    
    private void createWindow(){
        Window frame = new Window();
        frame.setSize(new Dimension(WIDTH,HEIGHT));
        
        SpringLayout layout = new SpringLayout();                               // New layout, look up tutorial to use it. 
        frame.setLayout(layout);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void update(){                                                       //updates after something happens
    /*Implementation not shown*/
    }
    
}
