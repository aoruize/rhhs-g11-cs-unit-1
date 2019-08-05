/* Variable3.java
 * This program outputs the result of different operations on two numbers
 * Author: Matthew Ao
 * 11 February 2019
 */

import java.util.Scanner;

class Variable3{
  public static void main(String[] args){
    // initiating scanner and input
    Scanner input = new Scanner(System.in);
    double num1; double num2;
    System.out.println("Enter number 1: "); num1 = input.nextDouble(); 
    System.out.println("Enter number 2: "); num2 = input.nextDouble(); 
    input.close();
    
    // operators 
    double sum; sum = num1 + num2;
    double difference; difference = num2 - num1;
    double product; product = num1 * num2;
    double quotient; quotient = num1 / num2;
    double modulus; modulus = num1 % num2;
    
    // output
    System.out.println(num1 + " + " + num2 + " = " + sum);
    System.out.println(num2 + " - " + num1 + " = " + difference);
    System.out.println(num1 + " x " + num2 + " = " + product);
    System.out.println(num1 + " / " + num2 + " = " + quotient);
    System.out.println("The remainder of " + num1 + "/" + num2 + " is " + modulus);
  }
}