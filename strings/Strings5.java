/* Strings5.java
 * This program is the challenge strings problem that decodes a secret message from sentences.
 * Author: Matthew Ao
 * 22 February 2019
 */

import java.util.Scanner;

class Strings5{
  public static void main(String[] args){
    // initiating scanner and inputs
    Scanner input = new Scanner(System.in);
    System.out.println("This program decodes a secret message using the first letter of every word in a sentence.");
    System.out.println("Enter a sentence: ");
    String sentence = input.nextLine();
    input.close();
    
    // splitting sentence into words
    String[] words = sentence.split(" ");
    
    // outputting first letter of each word
    for(int count = 0; count < words.length; count++){
      System.out.print(words[count].charAt(0));
    }
  }
}
