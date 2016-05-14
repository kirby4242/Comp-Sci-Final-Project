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
 * @author Kids
 */
public class Card20 extends Card {
    
    public Card20(){
        name = "The Shadow Realm";
        imageAddress = "resources/card_20.png";
        id = 20;
        rarity = "Uncommon";
        
    }
    @Override
    public void play(){
        Environment.setSun(Environment.sunlight-3);
    }

}
