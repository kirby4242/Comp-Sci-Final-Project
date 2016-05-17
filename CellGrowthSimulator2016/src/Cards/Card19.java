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
public class Card19 extends Card {
        public Card19(){
        name = "Mitochondria";
        imageAddress = "resources/card_19.png";
        id = 19;
        rarity = "Uncommon";
        
    }
    @Override
    public void play(){
        System.out.println("c19 trigger");
        Environment.setFood(Environment.food+2);
        Environment.setTemp(Environment.temp-1);
    }

}
