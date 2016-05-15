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
public class Card18 extends Card {
        public Card18(){
        name = "Chloroplasts";
        imageAddress = "resources/card_18.png";
        id = 18;
        rarity = "Uncommon";
        
    }
    @Override
    public void play(){
        Environment.setFood(Environment.food+3);
    }

}
