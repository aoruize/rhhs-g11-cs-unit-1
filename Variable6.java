/* Variable6.java
 * This program calculates the area and perimeter of a rectangle
 * Author: Matthew Ao
 * 11 February 2019
 */

import java.util.Scanner;

class Variable6{
  public static void main(String[] args){
    // initiating Scanner and getting inputs
    Scanner in = new Scanner(System.in);
    double length; System.out.println("Length of rectangle in cm: "); length = in.nextDouble();
    double width; System.out.println("Width of rectangle in cm: "); width = in.nextDouble();
    
    // calculations
    double perimeter; perimeter = 2*length + 2*width;
    double area; area = length*width;
    
    // output
    System.out.println("The perimeter of the rectangle is " + perimeter + " cm and the area of the rectangle is " + area + " cm squared.");
  }
}
