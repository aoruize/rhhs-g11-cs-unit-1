/* Strings4.java
 * This program print the words of a sentence on a new line
 * Author: Matthew Ao
 * 20 February 2019
 */

import java.util.Scanner;

class Strings4{
  public static void main(String[] args){
    // initiating scanner and inputs
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a sentence: ");
    String sentence = input.nextLine();
    input.close();
    
    // split sentence into separate strings
    String[] words = sentence.split(" ");
    int numWords = words.length;
    int x = 0;
    
    // printing every word onto a new line
    do{
    System.out.println(sentence.substring(0, sentence.indexOf(" ")));
    sentence = sentence.substring(sentence.indexOf(" ")+1);
    x = x + 1;
    }while(x<words.length-1);
    System.out.println(sentence);
  }
}