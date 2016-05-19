/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellgrowthsimulator2016;

import Cards.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author jackroy
 */
public class Mouse implements MouseListener{
    Card c;
    public Mouse(Card c){
        this.c = c;          // creates unique zones on cards
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("click");
        c.play(); // allows you to play card
    }
// unnessary methods that were forced to be added due to implementation
    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }
    
}
