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
public class Card16 extends Card {
    
    public Card16(){
        name = "Thick Cell Wall";
        imageAddress = "resources/card_16.png";
        id = 16;
        rarity = "Uncommon";
    }
     
    @Override
    public void play(){
        System.out.println("c16 trigger");
        Environment.setRad(Environment.radiation/4.0);
    }

}
