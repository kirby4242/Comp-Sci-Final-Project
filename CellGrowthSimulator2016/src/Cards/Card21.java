/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cards;

import cellgrowthsimulator2016.Environment;

/**
 *
 * @author Rich
 */
public class Card21 extends Card {
        public Card21(){
        name = "Rapid Metabolism";
        imageAddress = "resources/card_21.png";
        id = 21;
        rarity = "Uncommon";
        
    }
    @Override
    public void play(){
        Environment.setFood(Environment.food+2);
    }

}
