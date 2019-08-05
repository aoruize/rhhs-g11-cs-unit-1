/* Selection4.java
 * This program matches a number to another secret number
 * Author: Matthew Ao
 * February 24, 2019
 */

import java.util.Scanner;

class Selection4{
  public static void main(String[] args){
    // initiating scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a secret number from 1 to 10: ");
    int numSecret = input.nextInt();
    System.out.println("Guess the secret number: ");
    int num = input.nextInt();
    input.close();
    
    // outputting results
    if(num == numSecret){
      System.out.println("You win!");
    }else{
      System.out.println("Game over");
    }
  }
}