/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16312
 */
import java.util.Scanner;
import java.util.Random;

public class JankenTester {
    
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        Random rnd = new Random();
        int comp, plyr;
        
        comp = rnd.nextInt(9)+1;

        System.out.print("じゃんけん...[グー/0  チョキ/1  パー/2]>>>");
        plyr = stdIn.nextInt();
        
        Janken Player = new Player(plyr);
        Janken Comp = new Comp(comp);
        
        System.out.println("comp seed値:" + comp);
        
        Player.pon();
        Comp.pon();
        
        if(Player.getHand() == Comp.getHand()%3)
            System.out.println("引き分けです。");
        else if(Comp.getHand()%3 == Player.getHand()-1 || Comp.getHand()%3 == Player.getHand()+2 )
            System.out.println("あなたの負け。");
        else 
            System.out.println("あなたの勝ち。");
        
    }
    
}
