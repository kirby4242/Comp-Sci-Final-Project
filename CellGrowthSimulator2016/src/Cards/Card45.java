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
public class Card45 extends Card{
    public Card45(){
        name = "Buffer Acid";
        imageAddress = "resources/card_45.png";
        id = 45;
        rarity = "Common";
    }

    @Override
    public void play() {
        System.out.println("c45 trigger");
        Environment.setPH(Environment.pH - .5);
    }
}
