import java.util.Scanner;

public class combine {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int num = 18;
    System.out.print("Enter your Age: ");

    int age = sc.nextInt();

    if(age >= num){
      System.out.print("Tiguwang rakay ka oy");
    } else {
      System.out.print("Bata baka oy presko pa aw HAHHAHAH");
    }
    sc.close();
  }
}
