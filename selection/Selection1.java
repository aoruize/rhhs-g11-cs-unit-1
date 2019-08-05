/* Selection1.java
 * This program determines whether or not someone is a senior citizen
 * Author: Matthew Ao
 * February 24, 2019
 */

import java.util.Scanner;

class Selection1{
  public static void main(String[] args){
    // initiating scanner and inputs
    Scanner input = new Scanner(System.in);
    System.out.println("Senior Citizenship\nWhat is your age?");
    int age = input.nextInt();
    input.close();
    
    // output
    if(age >= 65){
      System.out.println("You are a senior citizen.");
    }else{
      System.out.println("You are not a senior citizen.");
    }
  }
}
