/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cards;
import cellgrowthsimulator2016.*;
import cellgrowthsimulator2016.Environment;
/**
 *
 * @author Sio
 */
public class Card39 extends Card{
    public Card39(){
        name = "Cleaners";
        imageAddress = "resources/card_39.png";
        id = 39;
        rarity = "Common";
    }

    @Override
    public void play() {
        System.out.println("c39 trigger");
        Environment.setPoll(Environment.pollution-3);
        Environment.setPH(Environment.pH+.5);
    }
}
