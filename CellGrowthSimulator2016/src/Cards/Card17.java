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
public class Card17 extends Card {
    
    public Card17(){
        name = "Shadow Realm";
        imageAddress = "resources/card_17.png";
        id = 17;
        rarity = "Uncommon";
    }
     
    @Override
    public void play(){
        Environment.setSun(Environment.sunlight - 3);
    }

}
