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
public class Card26 extends Card {
        public Card26(){
        name = "Sun Shields";
        imageAddress = "resources/card_26.png";
        id = 26;
        rarity = "Uncommon";
        
    }
    @Override
    public void play(){
        Environment.setSun(Environment.sunlight+100000);
        // sunlight doesnt kill you lol.
    }

}