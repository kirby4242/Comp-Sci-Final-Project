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
public class Card7 extends Card {
    
    public Card7(){
        name = "Aggessive Mimicry";
        imageAddress = "resources/card_7.png";
        id = 7;
        rarity = "Rare";
    }
     
    @Override
    public void play(){
        System.out.println("c7 trigger");
        Environment.setFood(Environment.food);
        /*Implementation not shown*/
    }

}
