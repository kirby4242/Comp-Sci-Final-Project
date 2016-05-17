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
public class Card24 extends Card {
        public Card24(){
        name = "Spare Vacules";
        imageAddress = "resources/card_24.png";
        id = 24;
        rarity = "Uncommon";
        
    }
    @Override
    public void play(){
        System.out.println("c24 trigger");
        Environment.setPoll(Environment.pollution-2);
        // lowers pollution kill limits
    }

}
