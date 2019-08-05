/* Selection10.java
 * This program helps a user pick a new car
 * Author: Matthew Ao
 * February 24, 2019
 */

import java.util.Scanner;

class Selection10{
  public static void main(String[] args){
    // initiating scanner
    Scanner input = new Scanner(System.in);
    System.out.println("This program helps users pick a new car.");
    
    // selection process
    System.out.println("Do you have $200 000 to $500 000?"); String response = input.next();
    if(response.equals("Yes")){
      System.out.println("Do you have to get places quickly?"); response = input.next();
      if(response.equals("Yes")){
        System.out.println("Purchase a Lamborghini Aventador");
      }else if(response.equals("No")){
        System.out.println("Purchase Rolls-Royce Phantom");
      }else{
        System.out.println("Learn to type");
      }
    }else if(response.equals("No")){
      System.out.println("Do you have $100 000 to $200 000?"); response = input.next();
      if(response.equals("Yes")){
        System.out.println("Do you like imports?"); response = input.next();
        if(response.equals("Yes")){
          System.out.println("Purchase a Nissan GTR");
        }else if(response.equals("No")){
          System.out.println("Purchase a Dodge Viper SRT");
        }else{
          System.out.println("Learn to type");
        }
      }else if(response.equals("No")){
        System.out.println("Purchase a Honda Fit");
      }else{
        System.out.println("Learn to type");
      }
    }else{
      System.out.println("Learn to type");
    }
    input.close();
  }
}