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
public class Card25 extends Card {
        public Card25(){
        name = "Sun Attractor";
        imageAddress = "resources/card_25.png";
        id = 25;
        rarity = "Uncommon";
        
    }
    @Override
    public void play(){
        System.out.println("c25 trigger");
        Environment.setSun(Environment.sunlight+1);
        // sunlight doesnt kill
    }

}
