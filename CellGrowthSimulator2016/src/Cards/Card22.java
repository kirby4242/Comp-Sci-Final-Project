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
public class Card22 extends Card{
        public Card22(){
        name = "Salavary Glands";
        imageAddress = "resources/card_22.png";
        id = 22;
        rarity = "Uncommon";
        
    }
    @Override
    public void play(){
        System.out.println("c22 trigger");
        Environment.setSun(Environment.sunlight);
        // salt becomes less of a problem
    }

}
