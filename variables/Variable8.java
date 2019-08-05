/* Variable8.java
 * This program outputs the interest earned in years given for an investment made
 * Author: Matthew Ao
 * 12 February 2019
 */

import java.util.Scanner;

class Variable8{
  public static void main(String[] args){
    // header
    System.out.println("Interest calculator\n");
    
    // initiating Scanner and receiving inputs
    Scanner input = new Scanner(System.in);
    double p; System.out.println("Principal invested: "); p = input.nextDouble();
    double r; System.out.println("Interest rate (%) per annum: "); r = input.nextDouble()*0.01;
    double t; System.out.println("Number of years of investment: "); t = input.nextDouble();
    
    // calculations
    double i; i = p*r*t;
    
    // output
    System.out.println("Interest Earned: $" + i);
    System.out.println("Total Amount Returned: $" + (p+i));
  }
}
    