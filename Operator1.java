public class Operator1 {
    public static void main(String[] args) {
        int a = 10;
     // int b = ++a; pre
     // int b = a++; //post
     // int b = --a; pre-decrement
        int b= a--; // post-decrement
        System.out.println(a);
        System.out.println(b);
    }
}
