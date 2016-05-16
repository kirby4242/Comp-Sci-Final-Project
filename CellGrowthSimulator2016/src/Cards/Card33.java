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
public class Card33 extends Card {
        public Card33(){
        name = "Random";
        imageAddress = "resources/card_33.png";
        id = 33;
        rarity = "Common";
        
    }
    @Override
    public void play(){
        Environment.setFood(100);
        //size =100
        
    }

}
