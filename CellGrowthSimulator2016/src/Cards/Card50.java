/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cards;
import cellgrowthsimulator2016.*;
import cellgrowthsimulator2016.Environment;
import cellgrowthsimulator2016.Cell;
/**
 *
 * @author Sio
 */
public class Card50 extends Card{
    
    public Card50(){
        name = "Mitosis";
        imageAddress = "resources/card_50.png";
        id = 50;
        rarity = "Common";
    }
    
    @Override
    public void play() {
        Cell.size ++;
        Environment.setFood(Environment.food+1);
    }
    
}
