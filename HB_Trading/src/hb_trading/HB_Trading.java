package hb_trading;
import java.math.BigInteger;
import java.util.*;

public class HB_Trading {

  
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int dollarquant=0,euroquant=0,ausdquant=0;
       float balance=5000;
        
       System.out.println("*******************************************\n");
       System.out.println("#####Welcome To Virtual Online Trading#####");
       System.out.println("*******************************************\n");
        System.out.println("Enter your name:\n");
        String name=sc.next();
        System.out.println("Enter your Email ID:\n");
        String email=sc.next();
        System.out.println("Account created.\nWelcome to Virtual online Trading\nYour are credited with Balance:-"+balance+"Rs\n");
        System.out.println("Menu:-\n"+"1.BUY\n2.Sell\n3.My protfolio\n4.Balance\n5.Add|withdraw\n");
        int opt=sc.nextInt();
        switch(opt){
            case 1:
                System.out.println("1.Currency\n2.Commodities\n3.Sensex|Nifty\n4.Mutual Funds");
                int opt2=sc.nextInt();    
                switch(opt2){
                    case 1:
                        System.out.println("1.Dollars\n2.Euro\n3.AUS dollar\n4.Pound");
                        int opt3=sc.nextInt(); 
                        switch(opt3){
                            case 1:
                                System.out.println("Enter the quantity:-");
                                int quantity=sc.nextInt();
                                if(balance>=(62.5*quantity)){
                                    System.out.println("Purchased."+"Total amount Deducted:-"+(62.5*quantity)+"\n");
                                    dollarquant=dollarquant+quantity;
                                    balance=(float) (balance-(62.5*quantity));
                                     System.out.println("Balance:-"+balance);
                                }
                                
                                        
                                
                    }
                    case 2:
                        System.out.println("1.Crude Oil\n2.Platinum\n3.Coal\n4.Petroleum");
                        int opt4=sc.nextInt();
                    default:
                        System.out.println("Service not available");
                        
                 
                        
                        
                } 
                
        }
        
        
        
        
    }
    
}
