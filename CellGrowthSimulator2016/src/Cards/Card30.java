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
public class Card30 extends Card{
        public Card30(){
        name = "Random";
        imageAddress = "resources/card_30.png";
        id = 30;
        rarity = "Uncommon";
        
    }
    @Override
    public void play(){
        System.out.println("c30 trigger");
        System.out.println("YOU DIED");
        Environment.setPred(1000000000);
        Environment.setRad(10000000000.0);
        Environment.setTemp(1000000000);
        System.exit(-1);
    }

}
