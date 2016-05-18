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
public class Card23 extends Card{
        public Card23(){
        name = "Tempature Regulater";
        imageAddress = "resources/card_23.png";
        id = 23;
        rarity = "Uncommon";
        
    }
    @Override
    public void play(){
        System.out.println("c23 trigger");
        Environment.setTemp(Environment.temp+ ((int) Math.random()*2-1));
    }

}
