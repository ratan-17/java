
import java.util.Scanner;

public class ClassA
{ 
     public static void main(String[] args)
     {
       System.out.println("Hello World");

       Scanner scan=new Scanner(System.in);
       System.out.println("Enter your Name");

       String name = scan.nextLine();

       System.out.println("Entered name is "+ name);

     }

    
}
