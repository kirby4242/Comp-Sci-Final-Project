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
public class Card48 extends Card{
    public Card48(){
        name = "Sun Beam";
        imageAddress = "resources/card_48.png";
        id = 48;
        rarity = "Common";
    }

    @Override
    public void play() {
        Environment.setSun(Environment.sunlight+1);
    }
}
