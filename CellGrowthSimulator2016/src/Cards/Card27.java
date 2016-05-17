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
public class Card27 extends Card{
        public Card27(){
        name = "Vampiric Cell";
        imageAddress = "resources/card_27.png";
        id = 27;
        rarity = "Uncommon";
        
    }
    @Override
    public void play(){
        System.out.println("c27 trigger");
        Environment.setSun(Environment.sunlight-100000000);
        // kill limits for sun decreasd jk
    }

}
