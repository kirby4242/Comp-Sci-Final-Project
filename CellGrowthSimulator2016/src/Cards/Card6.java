/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cards;
import cellgrowthsimulator2016.*;
import cellgrowthsimulator2016.Environment;
import java.awt.event.MouseEvent;
/**
 *
 * @author KeeganP
 */
public class Card6 extends Card {
    
    public Card6(){
        name = "Crystalize";
        imageAddress = "resources/card_6.png";
        id = 6;
        rarity = "Rare";
    }
     
    @Override
    public void play(){
        System.out.println("c6 trigger");
        Environment.setFood(Environment.food +(Environment.salt /2));
    }

}
