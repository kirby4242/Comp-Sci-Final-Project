/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellgrowthsimulator2016;

/**
 *
 * @author Kids
 */
public class Cell {
    // basic variables that help
    public static int size;
    public int growth;
    public static int turn;
    //start cell conditions
    public Cell(){
        size = 1;
        growth = 0;
        turn=1;
    }
    
}