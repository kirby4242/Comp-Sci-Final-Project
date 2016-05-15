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
public class Card29 extends Card {
        public Card29(){
        name = "Random Mutation";
        imageAddress = "resources/card_29.png";
        id = 29;
        rarity = "Uncommon";
        
    }
    @Override
    public void play(){
        Environment.setSun(Environment.sunlight);
        // nothing happens
    }

}
