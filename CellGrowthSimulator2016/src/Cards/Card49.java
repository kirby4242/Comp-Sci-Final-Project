/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cards;
import cellgrowthsimulator2016.*;
import cellgrowthsimulator2016.Environment;
/**
 *
 * @author Sio
 */
public class Card49 extends Card{
    public Card49(){
        name = "Nutrient Influx";
        imageAddress = "resources/card_49.png";
        id = 49;
        rarity = "Common";
    }
    
    @Override
    public void play(){
        System.out.println("c49 trigger");
        Environment.setFood(Environment.food +1);
    }
}
