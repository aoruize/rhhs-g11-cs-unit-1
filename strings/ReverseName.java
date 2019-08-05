import java.util.Scanner;

class ReverseName{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("This program reverses a name.\nEnter a name:");
    String name = input.nextLine(), reverseName = "";
    int nameLength = name.length();
    
    for(int i=nameLength-1;i>=0;i--){
      reverseName += name.charAt(i);
    }
    System.out.println(reverseName);
  }
}
