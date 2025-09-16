
import java.util.*;

public class function1 {
   public static void printHelloWorld() {
    System.out.println("Hello World!!!");
   }

   public static int calculateSum(int num1, int num2) {
  
   
    int sum = num1 + num2;
    return sum;
   
   }
   public static void main(String[] args) {  //parameters or formal parameters
      // printHelloWorld(); //function call
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int sum = calculateSum(a,b); //arguments or actual parameters
        System.out.println("sum is : " + sum);
   } 
}
