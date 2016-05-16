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
public class Card44 extends Card{
    public Card44(){
        name = "Hot";
        imageAddress = "resources/card_44.png";
        id = 44;
        rarity = "Common";
    }

    @Override
    public void play() {
        Environment.setTemp(Environment.temp+2);
    }
}
