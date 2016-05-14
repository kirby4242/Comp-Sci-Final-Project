package Cards;
import cellgrowthsimulator2016.*;
import java.awt.event.MouseListener;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keeganparkhurst
 */
public abstract class Card{
    String name;            //String for cardname
    public String imageAddress;    //String for image address
    int id;                 //Card id
    String rarity;          //Card rarity
    
    public abstract void play();    //Method that activates when you play the card
    
    /*
    * card 1 is legendary
    * 2-5 are mythic
    * 6-15 are rare
    * 17-30 are uncommon
    * 31-50 are common
    */
    //DO NOT GO OFF THE SPREADSHEET!!!!!
    //USE THE SETTERS IN ENVIRONMENT TO CHANGE STUFF IN THE PLAY METHOD
}
