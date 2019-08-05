/* Selection5.java
 * This program asks for a test mark and outputs the student's results
 * Author: Matthew Ao
 * February 24, 2019
 */

import java.util.Scanner;

class Selection5{
  public static void main(String[] args){
    // initiating scanner and inputs
    Scanner input = new Scanner(System.in);
    System.out.println("Test mark: ");
    int mark = input.nextInt();
    input.close();
    
    // output result
    if(mark >= 75 && mark <= 100){
      System.out.println("Great!");
    }else if(mark >= 50 && mark <= 74){
      System.out.println("Pass.");
    }else if(mark < 50 && mark >= 0){
      System.out.println("Fail.");
    }else{
      System.out.println("Invalid.");
    }
  }
}