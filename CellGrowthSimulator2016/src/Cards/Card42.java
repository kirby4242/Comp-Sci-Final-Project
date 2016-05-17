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
public class Card42 extends Card{
    public Card42(){
        name = "Chloroburst";
        imageAddress = "resources/card_42.png";
        id = 42;
        rarity = "Common";
    }

    @Override
    public void play() {
        System.out.println("c42 trigger");
        if(Environment.sunlight >= 3) Environment.setFood(Environment.food+3);
        else Environment.setFood(Environment.food);
    }
}
