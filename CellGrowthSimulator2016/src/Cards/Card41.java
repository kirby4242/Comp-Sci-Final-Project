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
public class Card41 extends Card{
    public Card41(){
        name = "Salt Metabolism";
        imageAddress = "resources/card_42.png";
        id = 42;
        rarity = "Common";
    }

    @Override
    public void play() {
        System.out.println("c41 trigger");
        Environment.setFood(Environment.food);
        //implimentation not shown, we need salt
    }
}
