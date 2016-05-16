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
public class Card40 extends Card{
    public Card40(){
        name = "Nuclear Spillage";
        imageAddress = "resources/card_40.png";
        id = 40;
        rarity = "Common";
    }

    @Override
    public void play() {
        Environment.setRad(Environment.radiation+2);
    }
}
