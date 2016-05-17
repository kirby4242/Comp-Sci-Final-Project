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
public class Card2 extends Card {
    
    public Card2(){
        name = "Ancestral Recall";
        imageAddress = "resources/card_2.png";
        id = 2;
        rarity = "Mythic";
    }
     
    @Override
    public void play(){
        System.out.println("c2 trigger");
        Environment.setFood(Environment.food);
        /*No implementation*/
    }

}
