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
public class Card10 extends Card {
    
    public Card10(){
        name = "Lead Walls";
        imageAddress = "resources/card_10.png";
        id = 10;
        rarity = "Rare";
    }
     
    @Override
    public void play(){
        System.out.println("c10 trigger");
        Window.radProtection += 50;
        Environment.setRad(Environment.radiation/2);
    }

}
