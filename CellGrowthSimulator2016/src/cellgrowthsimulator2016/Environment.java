/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellgrowthsimulator2016;
/**
 *
 * @author keeganparkhurst
 */
public class Environment {
    //Initialize variables
    public static int temp;
    public static int sunlight;
    public static int food;
    public static double pH;
    public static int predators;
    public static int salt;
    public static int pollution;
    public static double radiation;
    
    //default constructor
    public Environment(){
        temp = 20;
        sunlight = 3;
        food = 1;
        pH = 7.0;
        predators = 0;
        salt = 0;
        pollution = 0;
        radiation = 0.0;  
    }
    //setters for all the values, this way the update ocurs with each change
    public static void setTemp(int i){
        temp = i;
        Window.update();
    }
    public static void setSun(int i){
        sunlight = i;
        Window.update();
    }
    public static void setFood(int i){
        food = i;
        Window.update();
    }
    public static void setPH(double i){
        pH = i;
        Window.update();
    }
    public static void setPred(int i){
        predators = i;
        Window.update();
    }
    public static void setSalt(int i){
        salt = i;
        Window.update();
    }
    public static void setPoll(int i){
        pollution = i;
        Window.update();
    }
    public static void setRad(double i){
        radiation = i;
        Window.update();
    }  
    
}
