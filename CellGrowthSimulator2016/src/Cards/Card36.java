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
public class Card36 extends Card{
    public Card36(){
        name = "Half Life 3";
        imageAddress = "resources/card_36.png";
        id = 36;
        rarity = "Common";
    }

    @Override
    public void play() {
        Environment.setRad(Environment.radiation-3);
    }
}
