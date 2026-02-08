import java.util.Scanner;

public class try_this_day {
  public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    int ageLimit = 18;

    System.out.print("Enter your age: ");

    int age = scan.nextInt();

    if(age >= ageLimit){
      System.out.print("Sakto na imong edad pang scatter");
    } else {
      System.out.print("Bata paka di paka pwede");
    }

    scan.close();
    
  }
}
