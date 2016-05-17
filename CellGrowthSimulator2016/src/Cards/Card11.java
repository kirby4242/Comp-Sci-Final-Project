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
public class Card11 extends Card {
    
    public Card11(){
        name = "Surplus";
        imageAddress = "resources/card_11.png";
        id = 11;
        rarity = "Rare";
    }
     
    @Override
    public void play(){
        System.out.println("c11 trigger");
        Environment.setFood(Environment.food + 5);
    }

}
