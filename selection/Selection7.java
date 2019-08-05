/* Selection7.java
 * This program compares two marks between 0 and 100
 * Author: Matthew Ao
 * February 24, 2019
 */

import java.util.Scanner;

class Selection7{
  public static void main(String[] args){
    // initiating input
    Scanner input = new Scanner(System.in);
    System.out.println("Mark 1: "); 
    int mark1 = input.nextInt();
    System.out.println("Mark 2: "); 
    int mark2 = input.nextInt();
    input.close();
    
    // output higher mark
    if(mark1 > mark2){
      System.out.println(mark1);
    }else if(mark2 > mark1){
      System.out.println(mark2);
    }else{
      System.out.println("Both marks are equal.");
    }
  }
}
