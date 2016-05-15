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
public class Card4 extends Card {
    
    public Card4(){
        name = "Black Lotus";
        imageAddress = "resources/card_4.png";
        id = 3;
        rarity = "Mythic";
    }
     
    @Override
    public void play(){
        Environment.setSalt(Environment.salt * 2);
    }

}
