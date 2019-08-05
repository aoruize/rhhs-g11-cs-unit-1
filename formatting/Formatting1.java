/* Formatting1.java
 * This program outputs the value of Pi to 3 decimal places
 * Author: Matthew Ao
 * February 25, 2019
 */

import java.lang.Math;

class Formatting1{
  public static void main(String[] args){
    String output = String.format("%.3f", Math.PI);
    System.out.println(output);
  }
}
