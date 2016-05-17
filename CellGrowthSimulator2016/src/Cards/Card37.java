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
public class Card37 extends Card{
    public Card37(){
        name = "Tree of Life";
        imageAddress = "resources/card_37.png";
        id = 37;
        rarity = "Common";
    }

    @Override
    public void play() {
        System.out.println("c37 trigger");
        Cell.size+=3;
        Environment.setFood(Environment.food+3);
    }
}
