/* Formatting2.java
 * This program outputs 'HELLO' from the string 'Hello World'
 * Author: Matthew Ao
 * February 25, 2019
 */

class Formatting2{
  public static void main(String[] args){
    String string = "Hello World";
    string = String.format("%.5S", string);
    System.out.println(string);
  }
}