/* Strings2Again.java
 * This is a repeat of Strings2
 * Author: Matthew Ao
 * 19 February 2019
 */

import java.util.Scanner;

class Strings2Again{
  public static void main(String[] args){
    // initiating scanner and inputs
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a sentence: ");
    String sentence = input.nextLine().toLowerCase();
    input.close();
    
    // turning first letter to upper case
    char letter1 = sentence.charAt(0), letter2 = Character.toUpperCase(letter1);
    sentence = letter2 + sentence.substring(1, sentence.length());
    
    // output
    System.out.println(sentence);
  }
}