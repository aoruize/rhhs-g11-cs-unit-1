/* Formatting3.java
 * This program outputs "three two one" from the string "one two three"
 * Author: Matthew Ao
 * February 25, 2019
 */

class Formatting3{
  public static void main(String[] args){
    String string = "one two three";
    String output = String.format("%.3s", string);
    System.out.println(output);
    String msg = "Cats aren't all grumpy";
    String w = msg.substring(0, 6);
    System.out.println(w);
  }
}