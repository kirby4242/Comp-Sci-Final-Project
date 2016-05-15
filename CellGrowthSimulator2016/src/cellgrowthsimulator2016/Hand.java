/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellgrowthsimulator2016;

import Cards.Card;
import Cards.*;
import java.util.ArrayList;

/**
 *
 * @author Sio
 */
public class Hand {
    public ArrayList<Card> hand;
    
    public Hand(){
        hand = new ArrayList();
        hand.add(new Card49());
        hand.add(new Card20());
        //getCard();
        //getCard();
    }
    public void getCard(){
        int hold1 = (int)(Math.random()*101);//generates a random numeber
        
        int type;//determines rarity
        
        if(hold1<50){//assigns rarity based on precent
            type = 1;
        }else{
            if(hold1<75){
                type = 2;
            }else{
                if(hold1<90){
                    type = 3;
                }else{
                    if(hold1 < 100){
                        type = 4;
                    }else{
                        type = 5;
                    }
                }
            }
        }
        
        switch(type){//decides card
            
            case(1)://Common card
                int a = (int)(Math.random()*20);
                    switch(a){
                        case(0): hand.add(new Card50());
                            break;
                        case(1): hand.add(new Card49());
                            break;
                        case(2): hand.add(new Card48());
                            break;
                        case(3): hand.add(new Card47());
                            break;
                        case(4): hand.add(new Card46());
                            break;
                        case(5): hand.add(new Card45());
                            break;
                        case(6): hand.add(new Card44());
                            break;
                        case(7): hand.add(new Card43());
                            break;
                        case(8): hand.add(new Card42());
                            break;
                        case(9): hand.add(new Card41());
                            break;
                        case(10): hand.add(new Card10());
                            break;
                        case(11): hand.add(new Card39());
                            break;
                        case(12): hand.add(new Card38());
                            break;
                        case(13): hand.add(new Card37());
                            break;
                        case(14): hand.add(new Card36());
                            break;
                        case(15): hand.add(new Card35());
                            break;
                        case(16): hand.add(new Card34());
                            break;
                        case(17): hand.add(new Card33());
                            break;
                        case(18): hand.add(new Card32());
                            break;
                        case(19): hand.add(new Card31());
                            break;
                        default: System.out.println("you have an error in the hand class");
                        System.exit(-1);
                    }
            case(2)://Uncommon card
                int b = (int)(Math.random()*15);
                    switch(b){
                        case(0): hand.add(new Card30());
                            break;
                        case(1): hand.add(new Card29());
                            break;
                        case(2): hand.add(new Card28());
                            break;
                        case(3): hand.add(new Card27());
                            break;
                        case(4): hand.add(new Card26());
                            break;
                        case(5): hand.add(new Card25());
                            break;
                        case(6): hand.add(new Card24());
                            break;
                        case(7): hand.add(new Card23());
                            break;
                        case(8): hand.add(new Card22());
                            break;
                        case(9): hand.add(new Card21());
                            break;
                        case(10): hand.add(new Card20());
                            break;
                        case(11): hand.add(new Card19());
                            break;
                        case(12): hand.add(new Card18());
                            break;
                        case(13): hand.add(new Card17());
                            break;
                        case(14): hand.add(new Card16());
                            break;
                        default: System.out.println("you have an error in the hand class");
                        System.exit(-1);
                    }
                break;
            case(3)://Rare card
                int c = (int)(Math.random()*10);
                    switch(c){
                        case(0): hand.add(new Card15());
                            break;
                        case(1): hand.add(new Card14());
                            break;
                        case(2): hand.add(new Card13());
                            break;
                        case(3): hand.add(new Card12());
                            break;
                        case(4): hand.add(new Card11());
                            break;
                        case(5): hand.add(new Card10());
                            break;
                        case(6): hand.add(new Card9());
                            break;
                        case(7): hand.add(new Card8());
                            break;
                        case(8): hand.add(new Card7());
                            break;
                        case(9): hand.add(new Card6());
                            break;
                        default: System.out.println("you have an error in the hand class");
                        System.exit(-1);
                    }
                break;
            case(4)://Mythic card
                int d = (int)(Math.random()*4);
                    switch(d){
                        case(0): hand.add(new Card5());
                            break;
                        case(1): hand.add(new Card4());
                            break;
                        case(2): hand.add(new Card3());
                            break;
                        case(3): hand.add(new Card2());
                            break;
                        default: System.out.println("you have an error in the hand class");
                        System.exit(-1);
                    }
                break;
            case(5)://Legendary Card
                hand.add(new Card1());
                break;
            
            default: System.out.println("you have an error in the hand class");
                    System.exit(-1);                    
        }
    }
}
