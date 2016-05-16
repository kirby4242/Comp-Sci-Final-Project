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
public class Card15 extends Card {
    
    public Card15(){
        name = "Base Secretion";
        imageAddress = "resources/card_15.png";
        id = 15;
        rarity = "Uncommon";
    }
     
    @Override
    public void play(){
        Environment.setPH(Environment.pH + 2);
    }

}
