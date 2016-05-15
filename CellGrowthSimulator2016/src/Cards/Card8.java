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
public class Card8 extends Card {
    
    public Card8(){
        name = "Rapid Neutralization";
        imageAddress = "resources/card_8.png";
        id = 8;
        rarity = "Rare";
    }
     
    @Override
    public void play(){
        Environment.setPH(7.0);
        Environment.setSalt(Environment.salt + 5);
    }

}
