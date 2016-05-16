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
public class Card34 extends Card {
        public Card34(){
        name = "Random";
        imageAddress = "resources/card_34.png";
        id = 34;
        rarity = "Common";
        
    }
    @Override
    public void play(){
        System.exit(-1);
    }

}
