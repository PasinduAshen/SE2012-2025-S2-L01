import java.util.Scanner;

public class Welcome{
   public static void main(String[] args){

   Scanner scanner = new Scanner(System.in);    

    System.out.print("Enter your First name : ");
    String firstName = scanner.nextLine();

    System.out.print("Enter your second name : ");
    String lastName = scanner.nextLine();

    System.out.println("Welcome to second year " + firstName + " " + lastName);
    
    scanner.close();  


  }

}
