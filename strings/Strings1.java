/* Strings1.java
 * This program outputs the number of characters in an inputted sentence
 * Author: Matthew Ao
 * 13 February 2019
 */

import java.util.Scanner;

class Strings1{
  public static void main(String[] args){
    
    // Initiating scanner and inputs
    Scanner input = new Scanner(System.in);
    System.out.println("This program determines the length of a sentence.\nEnter a sentence:");
    String sentence = input.nextLine();
    input.close();
    
    // Output
    System.out.println("Your sentence is " + sentence.length() + " letters long.");
  }
}