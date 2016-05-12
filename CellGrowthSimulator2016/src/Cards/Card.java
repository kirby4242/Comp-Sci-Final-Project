package Cards;
import cellgrowthsimulator2016.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keeganparkhurst
 */
public abstract class Card {
    String name;            //String for cardname
    public String imageAddress;    //String for image address
    int id;                 //Card id
    String rarity;          //Card rarity
    
    public abstract void play();    //Method that activates when you play the card
}
