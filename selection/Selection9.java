/* Selection9.java
 * This program outputs three words in alphabetical order
 * Author: Matthew Ao
 * February 24, 2019
 */

import java.util.Scanner;

class Selection9{
  public static void main(String[] args){
    // initiating scanner and inputs
    Scanner input = new Scanner(System.in);
    System.out.println("This program rearranges three words in alphabetical order.");
    System.out.println("Word 1: "); String word1 = input.next();
    System.out.println("Word 2: "); String word2 = input.next();
    System.out.println("Word 3: "); String word3 = input.next();
    input.close();
    
    // outputting words in alphabetical order
    if(word1.compareTo(word2) < 0){
      if(word1.compareTo(word3) < 0){
        System.out.println(word1);
        if(word2.compareTo(word3) < 0){
          System.out.println(word2);
          System.out.println(word3);
        }else{
          System.out.println(word3);
          System.out.println(word2);
        }
      }else if(word3.compareTo(word1) < 0){
        System.out.println(word3);
        System.out.println(word1);
        System.out.println(word2);
      }
    }else if(word2.compareTo(word1) < 0){
      if(word2.compareTo(word3) < 0){
        System.out.println(word2);
        if(word1.compareTo(word3) < 0){
          System.out.println(word1);
          System.out.println(word3);
        }else{
          System.out.println(word3);
          System.out.println(word1);
        }
      }else if(word3.compareTo(word2) < 0){
        System.out.println(word3);
        System.out.println(word2);
        System.out.println(word1);
      }
    }else{
      System.out.println(word1);
      System.out.println(word2);
      System.out.println(word3);
    }
  }
}