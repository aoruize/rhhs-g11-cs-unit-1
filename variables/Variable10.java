/* Variable10.java
 * This program determines the number of roots in a quadratic
 * Author: Matthew Ao
 * 12 February 2019
 */

import java.util.Scanner;

class Variable10{
  public static void main(String[] args){
    // header
    System.out.println("This program determines the number of roots in a quadratic.");
    
    // initiating Scanner and receiving inputs
    Scanner input = new Scanner(System.in);
    double a; System.out.println("A = "); a = input.nextDouble();
    double b; System.out.println("B = "); b = input.nextDouble();
    double c; System.out.println("C = "); c = input.nextDouble();
    
    // Calculations
    double disc; disc = Math.pow(b, 2) - 4*a*c;
    System.out.println("\nDiscriminant = " + disc);
    
    // Output number of roots
    if(disc > 0){
      System.out.println("Since the discriminant > 0, there are 2 distinct real roots.");
    }else if(disc == 0){
      System.out.println("Since the discriminant = 0, there is 1 real root.");
    }else{
      System.out.println("Since the discriminant < 0, there are 0 real roots.");
    }
  }
}