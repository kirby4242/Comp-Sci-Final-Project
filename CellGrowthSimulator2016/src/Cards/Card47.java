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
public class Card47 extends Card{
    public Card47(){
        name = "Shadow";
        imageAddress = "resources/card_47.png";
        id = 47;
        rarity = "Common";
    }

    @Override
    public void play() {
        System.out.println("c47 trigger");
        Environment.setSun(Environment.sunlight-1);
    }
}
