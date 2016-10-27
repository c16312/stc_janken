/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16312
 */

public class Player extends Janken{
    private int hand;
    
    Player(int hand){
        this.hand = hand;
    }
    
    @Override
    int getHand(){ return hand; }
    
    @Override
    void pon(){
        switch(hand+1){
            case 1: System.out.println("あなた:グー"); break;
            case 2: System.out.println("あなた:チョキ"); break;
            case 3: System.out.println("あなた:パー"); break;
        }
    }
    
    
}
