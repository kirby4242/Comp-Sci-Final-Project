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
public class Card32 extends Card {
        public Card32(){
        name = "Random";
        imageAddress = "resources/card_32.png";
        id = 32;
        rarity = "Common";
        
    }
    @Override
    public void play(){
        System.out.println("c32 trigger");
        Environment.setPoll(0);
    }

}
