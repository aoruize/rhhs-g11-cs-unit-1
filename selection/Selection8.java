/* Selection8.java
 * This program asks the user how many times to print 'hello'.
 * Author: Matthew Ao
 * February 24, 2019
 */

import java.util.Scanner;

class Selection8{
  public static void main(String[] args){
    // initiating scanner and inputs
    Scanner input = new Scanner(System.in);
    System.out.println("How many times should hello be printed? (1 - 3)");
    int num = input.nextInt();
    input.close();
    
    // outputting hello
    if(num == 3){
      System.out.println("Hello\nHello\nHello");
    }else if(num == 2){
      System.out.println("Hello\nHello");
    }else if(num == 1){
      System.out.println("Hello");
    }else{
      System.out.println("Invalid number");
    }
  }
}
