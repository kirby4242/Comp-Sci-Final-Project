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
public class Card43 extends Card{
    public Card43(){
        name = "Cool";
        imageAddress = "resources/card_43.png";
        id = 43;
        rarity = "Common";
    }

    @Override
    public void play() {
        Environment.setTemp(Environment.temp-2);
    }
}
