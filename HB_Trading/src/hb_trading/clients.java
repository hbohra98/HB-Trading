package hb_trading;
import java.util.*;

public class clients {
    String client_name;
    String client_dob;
    int client_id;
    String client_email;
    int deposit=5000;
    
    void setter(){
    Scanner sc=new Scanner(System.in);
    //save input of client 
    System.out.println("Enter the name of client");
    this.client_name=sc.next();
    System.out.println("Enter the Date of birth of client");
    this.client_dob=sc.next();
    System.out.println("Enter the email of client");
    this.client_email=sc.next();
    }
    void getter(){
          System.out.println("\nId:-"+this.client_id+"\nName:-"+this.client_name+
                               "\nDate Of Birth:-"+this.client_dob+"\nEmail:-"+this.client_email+"\nDeposit:-"+this.deposit+"$\n");
    }
    
     void client_deposit(){
         //deposit money or add money
         System.out.println("Enter the total amount to deposit");  
          Scanner sc=new Scanner(System.in);
          this.deposit+=sc.nextInt();       
   }
     
     



}