/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellgrowthsimulator2016;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Sio
 */
public class Window extends JFrame{
    private int WIDTH;
    private int HEIGHT;
    
    public Window(int x){
        WIDTH = x;
        HEIGHT = WIDTH*3/4;
        this.createWindow();
    }
    public Window(){}
    
    private void createWindow(){
        Window frame = new Window();
        frame.setSize(new Dimension(WIDTH,HEIGHT));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
