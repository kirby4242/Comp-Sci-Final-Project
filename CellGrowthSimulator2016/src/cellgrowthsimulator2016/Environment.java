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
    
    //lethal condition variables
    public static int LTtemp = 30;
    public static int LTsunlight = 20;
    public static double LTpH = 12;
    public static int LTpollution=7;
    public static double LTradiation=5;
    
    public static int LBtemp = 10;
    public static int LBsunlight=-6;
    public static double LBpH = 2;
    public static int LBpollution = -999999999;
    public static double LBradiation = -999999999;
    
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
    //death conditions
    public static void livable(){
        if(temp > LTtemp || temp < LBtemp){
            System.out.println("YOU DIED FROM TEMPERATURE");
            System.exit(0);
        }
        if(sunlight > LTsunlight || sunlight < LBsunlight){
            System.out.println("YOU DIED FROM SUNLIGHT");
            System.exit(0);
        }
        if(pH > LTpH || pH < LBpH){
            System.out.println("YOU DIED FROM pH");
            System.exit(0);
        }
        if(pollution > LTpollution || pollution < LBpollution){
            System.out.println("YOU DIED FROM POLLUTION");
            System.exit(0);
        }
        if(radiation > LTradiation || radiation < LBradiation){
            System.out.println("YOU DIED FROM RADIATION");
            System.exit(0);
        }
    }
}
