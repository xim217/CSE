//Xintong Ming
//hw08-HW8.java
// 03/20/2015
import java.util.Scanner;
import java.lang.Math;
public class HW8{
public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }

 public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ         ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ         ");
        System.out.println("                           H    HHHHHHHHHHH    H              ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ         ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                  ");
    }

  public static void cave() {
        System.out.println("                              *****   * * * * * * * *         ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }

public static void box(){
        System.out.println("                     *********************     *********************    *********************           ");
        System.out.println("                     ***               ***     ***               ***    ***               ***           ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***           ");
        System.out.println("                     ***               ***     ***               ***    ***               ***           ");
        System.out.println("                     *********************     *********************    *********************           "); 
    }

public static String getInput(Scanner scan, String string){
    String Continue = scan.next();
    if (Continue.equals("c")||Continue.equals("C")){
        return "";
    }
    else {
        System.out.println("you chose to quit");
        System.exit(0);
    }
    return "";
}//this function takes in a scanner and a string “Cc”. It is used to continue the game. If the user enter ‘C’ or ‘c’, the game continue. ANY OTHER KEY results in “Yea right LOSER!” and quit the game.

public static String getInput(Scanner scan, String string, int trial){
    String commend= scan.next();
    int t=0;
    while (t<trial) {
        
    if (commend.equals("a")||commend.equals("A")){
        int random=(int)(Math.random()*2);
        if(random==1){
        t++;
        System.out.println("you made a critical hit");
        }
        else{
            System.out.println("you missed");
        }
    }
    else if (commend.equals("e")||commend.equals("E")){
        int random=(int)(Math.random()*11);
        if (random==10){
            System.out.println("you escaped");
            return"";
        }
        else{
            System.out.println("Your escape is not success");
        }
    }
    else {
        System.out.println("Wrong commend, you are eaten by Giant");
        System.exit(0);
    }
    if(t<10){
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        commend=scan.next();
    }
    
    }
    return "";
}//the most complicated method in this program. It takes in a string “AaEe”, and a counter trial:a attack,e escape, other die 

public static String getInput(Scanner scan){
            while (!scan.hasNextInt()){
            System.out.println("Not an integer");
            scan.next();
            }
            int reward= scan.nextInt();
            switch (reward){
             case 1:
             System.out.println(" you chose box 1 and you won the worst reward: 0 dollars");
             break;
             case 2:
             System.out.println(" you chose box 2 and its GPA4.0 hero! you win!");
             break;
             case 3:
             System.out.println(" you chose box 3 and you won the best reward: you can play again and get the best reward again!");
             break;
             default:
             System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
             System.exit(0);
             break;
            }
            return "";
}//the user chooses to open a treasury box from 1 of the 3.
}// end of the main class