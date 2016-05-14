/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellgrowthsimulator2016;

import Cards.Card;
import Cards.Card20;
import Cards.Card5;
import java.util.ArrayList;

/**
 *
 * @author Sio
 */
public class Hand {
    public ArrayList<Card> hand;
    
    public Hand(){
        hand = new ArrayList();
        hand.add(new Card20());
        hand.add(new Card20());
    }
}
