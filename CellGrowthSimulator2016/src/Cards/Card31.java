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
public class Card31 extends Card {
        public Card31(){
        name = "Random";
        imageAddress = "resources/card_31.png";
        id = 31;
        rarity = "Common";
        
    }
    @Override
    public void play(){
        Environment.setTemp(0);
    }

}
