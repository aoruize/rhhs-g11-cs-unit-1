/* Selection6.java
 * This program tests for a correct password
 * Author: Matthew Ao
 * February 24, 2019
 */

import java.util.Scanner;

class Selection6{
  public static void main(String[] args){
    // initiating scanner and input
    Scanner input = new Scanner(System.in);
    System.out.println("Enter password:");
    String password = input.next();
    input.close();
    
    // outputting result
    if(password.equals("happy")){
      System.out.println("You are logged in.");
    }else{
      System.out.println("Incorrect password.");
    }
  }
}