/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cards;

import java.util.ArrayList;
import cards.*;
/**
 *
 * @author KeeganP
 */
public class Hand {
    public ArrayList<Card> hand;
    
    public Hand(){
        ArrayList<Card> hand = new ArrayList();
        hand.add(new Card20());
        hand.add(new Card5());
    }
    
    
    
    public void drawCard(){
        /*add your math stuff*/
        if(hand.size()<=2){
        } else {
        }
    }
}
