/* Strings4_1.java
 * This program is a repeat of Strings4.java
 * Author: Matthew Ao
 * February 22, 2019
 */

import java.util.Scanner;

class Strings4_1{
  public static void main(String[] args){
    // initiating scanner and inputs
    Scanner input = new Scanner(System.in);
    System.out.println("This program breaks a sentence down.\n Enter a sentence: ");
    String sentence = input.nextLine();
    input.close();
    
    // splitting sentence into words
    String[] words = sentence.split(" ");
    
    // outputting words
    int x = 0;
    do{
      System.out.println(words[x]);
      x += 1;
    }while(x < words.length);
  }
}