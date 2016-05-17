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
public class Card9 extends Card {
    
    public Card9(){
        name = "Pollution Metabolism";
        imageAddress = "resources/card_9.png";
        id = 9;
        rarity = "Rare";
    }
     
    @Override
    public void play(){
        System.out.println("c9 trigger");
        Environment.setPoll(Environment.pollution - 3);
        Environment.setFood(Environment.food +3);
    }

}
