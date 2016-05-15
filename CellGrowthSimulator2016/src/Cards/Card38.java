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
public class Card38 extends Card{
    public Card38(){
        name = "Rios Water";
        imageAddress = "resources/card_38.png";
        id = 38;
        rarity = "Common";
    }

    @Override
    public void play() {
        Environment.setPoll(Environment.pollution+3);
    }
}
