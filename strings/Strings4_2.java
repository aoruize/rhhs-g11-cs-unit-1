/* Strings4_2.java
 * This program is an alternate version of Strings4.java
 * Author: Matthew Ao
 * 22 February 2019
 */

import java.util.Scanner;

class Strings4_2{
  public static void main(String[] args){
    // initiating scanner and inputs
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a sentence: ");
    String sentence = input.nextLine();
    input.close();
    
    // splitting sentence into words
    String[] words = sentence.split(" ");
    
    // outputting words 
    for(int count = 0; count < words.length; count++){
      System.out.println(words[count]);
    }
  }
}
