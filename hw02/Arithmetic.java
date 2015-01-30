// Xintong Ming
// CSE2
//01/30/2015
// hw02

 public class Arithmetic {
     
    public static void main(String[] args) { 
 //Number of pairs of socks
        int nSocks=3;  //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58; //Number of drinking glasses
        int nGlasses=6; //Cost per glass
        double glassCost$=2.29; //Number of boxes of envelopes
        int nEnvelopes=1; //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        double totalSockCost$;   //total cost of socks
        double totalGlassesCost$;   //total cost of socks
        double totalEnvelopesCost$;   //total cost of socks
        
    System.out.println("total sock sale is "+ (nSocks*sockCost$)+"  dollars and had "+(taxPercent*nSocks*sockCost$)+" dollars tax"); //total sock cost
    System.out.println("total glass sale is "+ (nGlasses*glassCost$)+" dollars and had "+(taxPercent*nGlasses*glassCost$)+" dollars tax"); // total 
    System.out.println("total envelopes sale is "+ (nEnvelopes*envelopeCost$)+" dollars and had "+(taxPercent*nEnvelopes*envelopeCost$)+" dollars tax");
    
    totalSockCost$=nSocks*sockCost$;
    totalGlassesCost$=nGlasses*glassCost$;
    totalEnvelopesCost$=nEnvelopes*envelopeCost$;
    
    System.out.println("Total Cost is "+(totalSockCost$+totalGlassesCost$+totalEnvelopesCost$)+" without tax");
    System.out.println("Acctual paid is "+(totalSockCost$+totalGlassesCost$+totalEnvelopesCost$+(totalSockCost$+totalGlassesCost$+totalEnvelopesCost$)*taxPercent)+" with tax") ;
    
}
}