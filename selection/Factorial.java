import java.util.Scanner;

class Factorial{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("This program calculates the factorial of a number.\nEnter a number:");
    long num = input.nextInt();
    long numFactorial = 1;
    for(int i=1;i<=num;i++){
      numFactorial = numFactorial*i;
    }
    System.out.println("The factorial of "+ num + " is " + numFactorial);
  }
}
