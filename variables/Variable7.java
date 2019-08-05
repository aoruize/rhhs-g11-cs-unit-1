/* Variable7.java
 * This program calculates the bill for a restaurant
 * Author: Matthew Ao
 * 11 February 2019
 */

import java.util.Scanner;

class Variable7{
  public static void main(String[] args){
    // displaying header
    System.out.println("Restaurant Bill\n");

    // initiating Scanner and inputs
    Scanner input = new Scanner(System.in);
    double cost; System.out.println("Total Cost in $: "); cost = input.nextDouble();
    double percentTip; System.out.println("Tip %: "); percentTip = input.nextDouble();
    double costAndTax; double costTip; double costTotal;
    
    // calculations
    costAndTax = cost + cost*0.13;
    costTip = percentTip/100*cost;
    costTotal = costAndTax + costTip;
    
    // output
    System.out.println("Total cost with tax: $" + costAndTax);
    System.out.println("Total cost of tip: $" + costTip);
    System.out.println("Total cost with tax and tip: $" + costTotal);
  }
}