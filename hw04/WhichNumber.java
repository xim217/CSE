// Xintong Ming
// CSE002
// hw04
// WhichNumber.java

import java.util.Scanner;
public class WhichNumber {
     public static void main(String[] args) {
   	    Scanner scanner; // declear imput
        scanner = new Scanner( System.in );
        System.out.println("Think of a number between 1 and 10 inclusive.");
        System.out.print("Is the number even ?");
        if(scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("Y")) {
            System.out.println("Is it divisible by 3? ");
                if(scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("N")){
                    System.out.print("Is the number divisible by 4?");
                        if (scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("Y")){
                            System.out.print("Is the number divided by 4 greater than 1?");
                                if (scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("Y")){
                                    System.out.print("Is your number 8 ?");
                                        if(scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("Y")){
                                            System.out.print("Yay!!!! I got it!!!");
                                        }
                                        else if (scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("N")){
                                            System.out.print("You are lying!!!");
                                        }
                                }
                                else if(scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("N")){
                                    System.out.print("Is your number 4 ?");
                                        if(scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("Y")){
                                            System.out.print("Yay!!!! I got it!!!");
                                        }
                                        else if (scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("N")){
                                            System.out.print("You are lying!!!");
                                        }
                                }
                        }
                        else if (scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("N")) {
                            System.out.print("Is your number divisible by 5?");
                                if (scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("Y")){
                                    System.out.print("Is your number 10 ?");
                                        if(scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("Y")){
                                            System.out.print("Yay!!!! I got it!!!");
                                        }
                                        else if (scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("N")){
                                            System.out.print("You are lying!!!");
                                        }
                                }
                                else if(scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("N")){
                                    System.out.print("Is your number 2 ?");
                                        if(scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("Y")){
                                            System.out.print("Yay!!!! I got it!!!");
                                        }
                                        else if (scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("N")){
                                            System.out.print("You are lying!!!");
                                        }
                                }
                            
                        }
                }
                else if(scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("Y")){
                    System.out.print("Is your number 6?");
                         if(scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("Y")){
                                            System.out.print("Yay!!!! I got it!!!");
                                        }
                                        else if (scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("N")){
                                            System.out.print("You are lying!!!");
                                        }
                    }
            } 
        else if(scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("N")) {
            System.out.println("Is it divisible by 3");
                if(scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("Y")){
                    System.out.print("When divided by 3 is the result greater than 1 ?");
                        if(scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("Y")){
                            System.out.print("Is the number 9 ?");
                                if(scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("Y")){
                                            System.out.print("Yay!!!! I got it!!!");
                                }
                                else if (scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("N")){
                                            System.out.print("You are lying!!!");
                                }
                        }
                        else if (scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("N")){
                             System.out.print("Is the number 3 ?");
                                if(scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("Y")){
                                            System.out.print("Yay!!!! I got it!!!");
                                }
                                else if (scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("N")){
                                            System.out.print("You are lying!!!");
                                }
                        }
                }        
                else if (scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("N")) {
                     System.out.print("Is it greater than 6 ?");
                                if (scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("Y")){
                                    System.out.print("Is your number 7 ?");
                                        if(scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("Y")){
                                            System.out.print("Yay!!!! I got it!!!");
                                        }
                                        else if (scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("N")){
                                            System.out.print("You are lying!!!");
                                        }
                                }
                                else if(scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("N")){
                                    System.out.print("Is it less than 3 ?");
                                        if (scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("Y")){
                                            System.out.print("Is your number 1 ?");
                                                if(scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("Y")){
                                                    System.out.print("Yay!!!! I got it!!!");
                                                }
                                                 else if (scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("N")){
                                                    System.out.print("You are lying!!!");
                                                }
                                        }
                                        else if (scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("N")){
                                            System.out.print("Is your number 5 ?");
                                                if(scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("Y")){
                                                    System.out.print("Yay!!!! I got it!!!");
                                                }
                                                else if (scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("N")){
                                                    System.out.print("You are lying!!!");
                                                }
                                        }
                                }
                }
        else {System.out.println("Invalid character");
        }
        }
    }
}    