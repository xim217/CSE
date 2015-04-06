import java.util.Scanner;
public class lab09{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int i=0;
        while(i>-1){
            System.out.println("The "+adjective()+" "+adjective()+" "+subject()+" "+pastTenseVerb()+" the "+adjective()+" "+object()+".");
            System.out.println("Another sentence (Yes or No)?");
            String input=scan.next();
            if(input.equals("No")){
                i--;
            }
            else if(input.equals("Yes")){
            }
        }
    }
    public static String adjective(){
        int rN=(int)(Math.random()*10);
        switch (rN){
            case 0: return "amazing";
            case 1: return "bad"; 
            case 2: return "smoothy"; 
            case 3: return "elastic"; 
            case 4: return "fat"; 
            case 5: return "eager"; 
            case 6: return "flimsy"; 
            case 7: return "optimistic"; 
            case 8: return "soggy"; 
            case 9: return "zesty"; 
        }
        return "";
    }
    public static String subject(){
        int rN=(int)(Math.random()*10);
        switch (rN){
            case 0: return "apple";
            case 1: return "boy"; 
            case 2: return "mammoth"; 
            case 3: return "mother"; 
            case 4: return "lion"; 
            case 5: return "game"; 
            case 6: return "bear"; 
            case 7: return "desicion"; 
            case 8: return "money"; 
            case 9: return "white"; 
        }
        return "";
    }
    public static String pastTenseVerb(){
        int rN=(int)(Math.random()*10);
        switch (rN){
            case 0: return "took";
            case 1: return "ran"; 
            case 2: return "used"; 
            case 3: return "gone"; 
            case 4: return "fired"; 
            case 5: return "visited"; 
            case 6: return "did"; 
            case 7: return "marched"; 
            case 8: return "made"; 
            case 9: return "raced"; 
        }
        return "";
    }
    public static String object(){
        int rN=(int)(Math.random()*10);
        switch (rN){
            case 0: return "tree";
            case 1: return "plant"; 
            case 2: return "president"; 
            case 3: return "car"; 
            case 4: return "moutain"; 
            case 5: return "house"; 
            case 6: return "chair"; 
            case 7: return "country"; 
            case 8: return "table";
            case 9: return "pen"; 
        }
        return "";
    }
    
}