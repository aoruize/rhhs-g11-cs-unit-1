/* Selection2.java
 * This program asks for a test mark
 * Author: Matthew Ao
 * February 24, 2019
 */

import java.util.Scanner;

class Selection2{
  public static void main(String[] args){
    // initiating scanner and inputs
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your test mark: ");
    int mark = input.nextInt();
    input.close();
    
    // output result
    if(mark >= 50){
      System.out.println("You passed!");
    }else{
      System.out.println("Better luck next time!");
    }
  }
}