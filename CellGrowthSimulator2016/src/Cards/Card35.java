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
public class Card35 extends Card{
    public Card35(){
        name = "Random";
        imageAddress = "resources/card_35.png";
        id = 35;
        rarity = "Common";
    }

    @Override
    public void play() {
        System.out.println("c35 trigger");
        Environment.setFood(Environment.food);
        //implementation not shown
    }
    
}
