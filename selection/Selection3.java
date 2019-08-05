/* Selection3.java
 * This program asks for a temperature 
 * Author: Matthew Ao
 * February 24, 2019
 */

import java.util.Scanner;

class Selection3{
  public static void main(String[] args){
    // initiating scanner and inputs
    Scanner input = new Scanner(System.in);
    System.out.println("What is the temperature in degrees celsius?");
    int temp = input.nextInt();
    input.close();
    
    // output temperature
    if(temp > 30){
      System.out.println("Hot!");
    }else if(temp >= 20 && temp <= 30){
      System.out.println("Comfortable.");
    }else if(temp >= 10){
      System.out.println("Cool.");
    }else{
      System.out.println("..cold..");
    }
  }
}
