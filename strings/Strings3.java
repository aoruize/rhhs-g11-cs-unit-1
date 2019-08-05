/* Strings3.java
 * This program compares the value of two strings
 * Author: Matthew Ao
 * 19 February 2019
 */

import java.util.Scanner;

class Strings3{
  public static void main(String[] args){
    // initiating scanner and inputs
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a word: "); String word1 = input.next();
    System.out.println("Enter another word: "); String word2 = input.next();
    input.close();
    
    // comparing values of strings
    int value = word1.compareTo(word2);
    System.out.println(value);
  }
}

