
import java.util.*;
public class Modify {
    public static void main(String[] args) {
        // int a = 25;
        // int b = a;
     //   long a = 25;
     //   int b = a;      //also known as implicit and widening conversion
    Scanner sc = new Scanner(System.in);
    float a = 25.999999f;  //floor function(narrowing conversion/explicit)
    int b = (int) a;
    System.out.println(b);
    
    
    }

}
