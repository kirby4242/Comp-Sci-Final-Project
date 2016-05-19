/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellgrowthsimulator2016;

import Cards.Card;
import Cards.*;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Sio
 */
public class Hand {
    public ArrayList<Card> hand;
    public ArrayList<Card> AL(){
         ArrayList<Card> AL = new ArrayList<Card>();
         AL.add(new Card1());
          AL.add(new Card2());
           AL.add(new Card3());
            AL.add(new Card4());
             AL.add(new Card5());
                      AL.add(new Card6());
          AL.add(new Card7());
           AL.add(new Card8());
            AL.add(new Card9());
             AL.add(new Card10());
                      AL.add(new Card11());
          AL.add(new Card12());
           AL.add(new Card13());
            AL.add(new Card14());
             AL.add(new Card15());
                      AL.add(new Card16());
          AL.add(new Card17());
           AL.add(new Card18());
            AL.add(new Card19());
    //         AL.add(new Card20());
                      AL.add(new Card21());
          AL.add(new Card22());
           AL.add(new Card23());
            AL.add(new Card24());
             AL.add(new Card25());
                      AL.add(new Card26());
          AL.add(new Card27());
           AL.add(new Card28());
            AL.add(new Card29());
             AL.add(new Card30());
                      AL.add(new Card31());
          AL.add(new Card32());
           AL.add(new Card33());
            AL.add(new Card34());
             AL.add(new Card35());
                      AL.add(new Card36());
          AL.add(new Card37());
           AL.add(new Card38());
            AL.add(new Card39());
             AL.add(new Card40());
                                   AL.add(new Card41());
          AL.add(new Card42());
           AL.add(new Card43());
            AL.add(new Card44());
             AL.add(new Card45());
                      AL.add(new Card46());
          AL.add(new Card47());
           AL.add(new Card48());
            AL.add(new Card49());
             AL.add(new Card50());
             return AL;
     }
    public Hand(){
        hand = new ArrayList();
   
 Random rand = new Random();
 Random rand1 = new Random();
       ArrayList<Card> AL= AL(); 
     
       rand1.nextInt(AL.size());
       hand.add(0,AL.get(rand.nextInt(AL.size()))); 
       hand.add(1,AL.get(rand1.nextInt(AL.size()))); 
/*
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
                        case(0): hand.set(0,new Card50());
                            break;
                        case(1): hand.set(0,new Card49());
                            break;
                        case(2): hand.set(0,new Card48());
                            break;
                        case(3): hand.set( 0,new Card47());
                            break;
                        case(4): hand.set( 0,new Card46());
                            break;
                        case(5): hand.set( 0,new Card45());
                            break;
                        case(6): hand.set(0,new Card44());
                            break;
                        case(7): hand.set(0,new Card43());
                            break;
                        case(8): hand.set(0,new Card42());
                            break;
                        case(9): hand.set(0,new Card41());
                            break;
                        case(10): hand.set(0,new Card40());
                            break;
                        case(11): hand.set(0,new Card39());
                            break;
                        case(12): hand.set(0,new Card38());
                            break;
                        case(13): hand.set( 0, new Card37());
                            break;
                        case(14): hand.set(0,new Card36());
                            break;
                        case(15): hand.set(0,new Card35());
                            break;
                        case(16): hand.set(0,new Card34());
                            break;
                        case(17): hand.set(0,new Card33());
                            break;
                        case(18): hand.set(0,new Card32());
                            break;
                        case(19): hand.set(0,new Card31());
                            break;
                        default: System.out.println("you have an error in the hand class");
                        System.exit(-1);
                    }
            case(2)://Uncommon card
                int b = (int)(Math.random()*15);
                    switch(b){
                        case(0): hand.set(0,new Card30());
                            break;
                        case(1): hand.set(0,new Card29());
                            break;
                        case(2): hand.set(0,new Card28());
                            break;
                        case(3): hand.set(0,new Card27());
                            break;
                        case(4): hand.set(0,new Card26());
                            break;
                        case(5): hand.set(0,new Card25());
                            break;
                        case(6): hand.set(0,new Card24());
                            break;
                        case(7): hand.set(0,new Card23());
                            break;
                        case(8): hand.set(0,new Card22());
                            break;
                        case(9): hand.set(0,new Card21());
                            break;
                        case(10): hand.set(0,new Card20());
                            break;
                        case(11): hand.set(0,new Card19());
                            break;
                        case(12): hand.set(0,new Card18());
                            break;
                        case(13): hand.set(0,new Card17());
                            break;
                        case(14): hand.set(0,new Card16());
                            break;
                        default: System.out.println("you have an error in the hand class");
                        System.exit(-1);
                    }
                break;
            case(3)://Rare card
                int c = (int)(Math.random()*10);
                    switch(c){
                        case(0): hand.set(0,new Card15());
                            break;
                        case(1): hand.set(0,new Card14());
                            break;
                        case(2): hand.set(0, new Card13());
                            break;
                        case(3): hand.set(0,new Card12());
                            break;
                        case(4): hand.set(0,new Card11());
                            break;
                        case(5): hand.set(0,new Card10());
                            break;
                        case(6): hand.set(0,new Card9());
                            break;
                        case(7): hand.set(0,new Card8());
                            break;
                        case(8): hand.set(0,new Card7());
                            break;
                        case(9): hand.set(0,new Card6());
                            break;
                        default: System.out.println("you have an error in the hand class");
                        System.exit(-1);
                    }
                break;
            case(4)://Mythic card
                int d = (int)(Math.random()*4);
                    switch(d){
                        case(0): hand.set(0,new Card5());
                            break;
                        case(1): hand.set(0,new Card4());
                            break;
                        case(2): hand.set(0,new Card3());
                            break;
                        case(3): hand.set(0,new Card2());
                            break;
                        default: System.out.println("you have an error in the hand class");
                        System.exit(-1);
                    }
                break;
            case(5)://Legendary Card
                hand.set(0,new Card1());
                break;
            
            default: System.out.println("you have an error in the hand class");
                    System.exit(-1);  
        }
                            int hold2 = (int)(Math.random()*101);//generates a random numeber
        
      int type1;
        
        if(hold2<50){//assigns rarity based on precent
            type1 = 1;
        }else{
            if(hold2<75){
                type1 = 2;
            }else{
                if(hold2<90){
                    type1 = 3;
                }else{
                    if(hold2 < 100){
                        type1 = 4;
                    }else{
                        type1 = 5;
                    }
                }
            }
        }
        
        switch(type1){//decides card
            
            case(1)://Common card
                int f = (int)(Math.random()*20);
                    switch(f){
                        case(0): hand.set(1,new Card50());
                            break;
                        case(1): hand.set(1,new Card49());
                            break;
                        case(2): hand.set(1,new Card48());
                            break;
                        case(3): hand.set(1,new Card47());
                            break;
                        case(4): hand.set(1,new Card46());
                            break;
                        case(5): hand.set(1,new Card45());
                            break;
                        case(6): hand.set(1,new Card44());
                            break;
                        case(7): hand.set(1,new Card43());
                            break;
                        case(8): hand.set(1,new Card42());
                            break;
                        case(9): hand.set(1,new Card41());
                            break;
                        case(10): hand.set(1,new Card40());
                            break;
                        case(11): hand.set(1,new Card39());
                            break;
                        case(12): hand.set(1,new Card38());
                            break;
                        case(13): hand.set(1,new Card37());
                            break;
                        case(14): hand.set(1,new Card36());
                            break;
                        case(15): hand.set(1,new Card35());
                            break;
                        case(16): hand.set(1,new Card34());
                            break;
                        case(17): hand.set(1,new Card33());
                            break;
                        case(18): hand.set(1,new Card32());
                            break;
                        case(19): hand.set(1,new Card31());
                            break;
                        default: System.out.println("you have an error in the hand class");
                        System.exit(-1);
                    }
            case(2)://Uncommon card
                int g = (int)(Math.random()*15);
                    switch(g){
                        case(0): hand.set(1,new Card30());
                            break;
                        case(1): hand.set(1,new Card29());
                            break;
                        case(2): hand.set(1,new Card28());
                            break;
                        case(3): hand.set(1,new Card27());
                            break;
                        case(4): hand.set(1,new Card26());
                            break;
                        case(5): hand.set(1,new Card25());
                            break;
                        case(6): hand.set(1,new Card24());
                            break;
                        case(7): hand.set(1,new Card23());
                            break;
                        case(8): hand.set(1,new Card22());
                            break;
                        case(9): hand.set(1,new Card21());
                            break;
                        case(10): hand.set(1,new Card20());
                            break;
                        case(11): hand.set(1,new Card19());
                            break;
                        case(12): hand.set(1,new Card18());
                            break;
                        case(13): hand.set(1,new Card17());
                            break;
                        case(14): hand.set(1,new Card16());
                            break;
                        default: System.out.println("you have an error in the hand class");
                        System.exit(-1);
                    }
                break;
            case(3)://Rare card
                int h = (int)(Math.random()*10);
                    switch(h){
                        case(0): hand.set(1,new Card15());
                            break;
                        case(1): hand.set(1,new Card14());
                            break;
                        case(2): hand.set(1, new Card13());
                            break;
                        case(3): hand.set(1, new Card12());
                            break;
                        case(4): hand.set(1,new Card11());
                            break;
                        case(5): hand.set(1,new Card10());
                            break;
                        case(6): hand.set(1,new Card9());
                            break;
                        case(7): hand.set(1,new Card8());
                            break;
                        case(8): hand.set(1,new Card7());
                            break;
                        case(9): hand.set(1,new Card6());
                            break;
                        default: System.out.println("you have an error in the hand class");
                        System.exit(-1);
                    }
                break;
            case(4)://Mythic card
                int i = (int)(Math.random()*4);
                    switch(i){
                        case(0): hand.set(1,new Card5());
                            break;
                        case(1): hand.set(1,new Card4());
                            break;
                        case(2): hand.set(1,new Card3());
                            break;
                        case(3): hand.set(1, new Card2());
                            break;
                        default: System.out.println("you have an error in the hand class");
                        System.exit(-1);
                    }
                break;
            case(5)://Legendary Card
                hand.set(1,new Card1());
                break;
            
            default: System.out.println("you have an error in the hand class");
                    System.exit(-1);                    
        }*/
        }

    }

