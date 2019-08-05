/* While1.java
 * This program accepts a correct password
 * Author: Matthew Ao
 * February 25, 2019
 */

import java.util.Scanner;

class While1{
  public static void main(String[] args){
    // initiating scanner and inputs
    Scanner input = new Scanner(System.in);
    System.out.println("Set password: "); 
    String truePassword = input.nextLine();
    String password = "";
    
    // confirming password 
    do{
      System.out.println("Enter password: ");
      password = input.nextLine();
      if(password.equals(truePassword)){
        System.out.println("You are logged in.");
      }else{
        System.out.println("Incorrect password.");
      }
    }while(password.compareTo(truePassword) != 0);
    input.close();
  }
}