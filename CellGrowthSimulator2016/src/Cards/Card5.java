/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cards;
import cellgrowthsimulator2016.*;
import cellgrowthsimulator2016.Environment;
/**
 *
 * @author KeeganP
 */
public class Card5 extends Card {
    
    public Card5(){
        name = "Kawaii Senpai Mr. David";
        imageAddress = "resources/card_5.png";
        id = 5;
        rarity = "Mythic";
    }
    
    @Override
    public void play(){
        Environment.predators = 0;
        Window.update();
    }
}
