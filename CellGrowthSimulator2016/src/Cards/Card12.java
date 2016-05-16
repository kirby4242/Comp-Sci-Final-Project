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
public class Card12 extends Card {
    
    public Card12(){
        name = "Alpha Male";
        imageAddress = "resources/card_12.png";
        id = 12;
        rarity = "Rare";
    }
     
    @Override
    public void play(){
        Environment.setPred(Environment.predators - 1);
        Environment.setFood(Environment.food + 1);
    }

}
