/* Variable9.java
 * This program outputs the quotient of two integers, without rounding
 * Author: Matthew Ao
 * 12 February 2019
 */

import java.util.Scanner;

class Variable9{
  public static void main(String[] args){
    // Header
    System.out.println("This program calculates the quotient of two integers without rounding.\n");
    
    // Initiating Scanner and receiving inputs
    Scanner input = new Scanner(System.in);
    int int1; System.out.println("Number 1: "); int1 = input.nextInt();
    int int2; System.out.println("Number 2: "); int2 = input.nextInt();
    
    // Calculations
    double num1 = new Double(int1)*1.0; double num2 = new Double(int2)*1.0; // converting int1 and int1 to doubles
    double quotient; quotient = num1/num2;
    
    // Output
    System.out.println("\n" + int1 + " / " + int2 + " = " + quotient);
  }
}