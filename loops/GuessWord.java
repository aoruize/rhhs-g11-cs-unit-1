f/* GuessWord.java
 * A game where the user guesses a secret word
 * Author: Matthew Ao
 * February 26, 2019
 */

import java.util.Scanner;

class GuessWord{
  public static void main(String[] args){
    // initiating scanner and variables
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Guess the Phrase! \n Enter the secret phrase below: ");
    String word = input.nextLine();
    int wordLength = word.length();
    int counter = 0;
    String current = "";
    
    // represent secret word with asterisks
    for(int i=0; i<wordLength; i++){
      current += "*";
    }
    
    // guessing game begins
    System.out.println("\nLet the guessing begin!\n\n" + current + "\n");
    do{
      counter += 1;
      
      // reading letter from user
      System.out.println("Guess a character: ");
      String guess = Character.toString(input.nextLine().charAt(0));
      
      for(int i=0; i<wordLength; i++){
        if(guess.compareToIgnoreCase(Character.toString(word.charAt(i))) == 0){
          current = current.substring(0,i) + guess.charAt(0) + current.substring(i+1, wordLength);
        }else{
        }
      }
      
      System.out.println("\n" + current);
    }while(current.compareToIgnoreCase(word) != 0);
    
    // output win game
    System.out.println("\nCongratulations! You guessed the phrase in " + counter + " tries.");
  }
}
