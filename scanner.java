import java.util.Scanner;

class Main {
  public static void main (String [] args) {
    Scanner method = new Scanner(System.in);
    System.out.print("Enter your name, age, and salary: ");

    String username = method.nextLine();
    int age = method.nextInt();
    float salary = method.nextFloat();

    System.out.println("Name: " + username);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);

    method.close();

  }
}