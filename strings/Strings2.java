/* Strings2.java
 * This program makes all characters except for the first one lower-case.
 * Author: Matthew Ao
 * 13 February 2019
 */

import java.util.Scanner;

class Strings2{
  public static void main(String[] args){
    // initiating Scanner and inputs
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a sentence: ");
    String sentence = input.nextLine().toLowerCase();
    input.close();
    
    // turning the first character into upper case
    char letter1 = sentence.charAt(0), letter2 = Character.toUpperCase(letter1);
    sentence = letter2+sentence.substring(1, sentence.length());
    System.out.println(sentence);
  }
}