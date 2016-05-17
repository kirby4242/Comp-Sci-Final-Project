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
public class Card28 extends Card {
        public Card28(){
        name = "Vault Survivor";
        imageAddress = "resources/card_28.png";
        id = 28;
        rarity = "Uncommon";
        
    }
    @Override
    public void play(){
        System.out.println("c28 trigger");
        Environment.setRad(Environment.radiation-5);
        // radiation becomes less of a problem
    }

}
