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
public class Card46 extends Card{
    public Card46(){
        name = "Buffer Base";
        imageAddress = "resources/card_46.png";
        id = 46;
        rarity = "Common";
    }

    @Override
    public void play() {
        Environment.setPH(Environment.pH +.5);
    }
}
