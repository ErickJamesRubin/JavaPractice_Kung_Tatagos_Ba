import java.util.Scanner;

class Main {
  public static void main (String [] args) {
    Scanner method = new Scanner(System.in);
    System.out.println("PLease input a destined number of your choice: ");

    String username = method.nextLine();
    System.out.println("Here is your number: " + username);

  }
}