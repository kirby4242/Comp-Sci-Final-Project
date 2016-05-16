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
public class Card14 extends Card {
    
    public Card14(){
        name = "Acid Secretion";
        imageAddress = "resources/card_14.png";
        id = 14;
        rarity = "Uncommon";
    }
     
    @Override
    public void play(){
        Environment.setPH(Environment.pH -2);
    }

}
