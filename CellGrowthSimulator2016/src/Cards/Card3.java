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
public class Card3 extends Card {
    
    public Card3(){
        name = "Black Lotus";
        imageAddress = "resources/card_3.png";
        id = 3;
        rarity = "Mythic";
    }
     
    @Override
    public void play(){
        System.out.println("c3 trigger");
        Environment.setFood(Environment.food);
        Cell.size += 3;
    }

}
