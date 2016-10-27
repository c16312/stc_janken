/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16312
 */
public class Comp extends Janken{
    private int hand;
    
    Comp(int hand){
        this.hand = hand;
    }
    
    @Override
    int getHand(){ return hand; }
    
    @Override
    void pon(){
        int result = hand % 3;
        if(result == 0)
            System.out.println("cmp　:グー");/*3,6,9*/
        else if(result == 1)
            System.out.println("cmp　:チョキ");/*1,4,7*/
        else
            System.out.println("cmp　:パー");/*2,5,8*/
    }
}
