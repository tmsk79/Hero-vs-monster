
package hero_vs_monster;

import java.util.Random;

public class Game {
    public boolean attack(int monsterHP){
        boolean ifHeroWins = false;
        int tmpHP = monsterHP;
        for (int i = 1; i <= monsterHP; i++ ){           
            int heroAttack = rndNum(6); //dice roll with a 6 side dice
            int monsterAttack = rndNum(7); //dice roll with a 7 side dice          
            if(monsterAttack == 7){ //if the monster hit 7, the hero dies
                System.out.println("The monster attacks for a mighty 7, the hero instantly dies :(");
                ifHeroWins = false;
                break;
            } else if (tmpHP - heroAttack > 0){
                tmpHP -= heroAttack;
                System.out.println("The monster attacks for: " + monsterAttack + "\nThe hero attacks for: " + heroAttack + "\nThe monster has " + tmpHP + "hp left");
            } else if (tmpHP - heroAttack <= 0){ // if the monster's hp reach 0, the hero wins               
                ifHeroWins = true;                
            }
       }
       if(ifHeroWins){
        System.out.println("The hero wins!");
        return ifHeroWins;
       } else {
        System.out.println("The monster wins!");
        return ifHeroWins;
        }
    }
    
    public int rndNum(int diceSide){
        Random rn = new Random();        
        int score = rn.nextInt(diceSide)+1;
        return score;        
    }
}
