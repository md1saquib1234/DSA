public class Operator3 {
    public static void main(String[] args) {
        //logical And 
        System.out.println((3>2 && (5>0)));
        System.out.println((3>2 && (5<0)));
        System.out.println((3<2 && (5>0)));
        System.out.println((3<2 && (5<0)));

        //logical OR
        System.out.println((3>2 || (5>0)));
        System.out.println((3>2 || (5<0)));
        System.out.println((3<2 || (5>0)));
        System.out.println((3<2 || (5<0)));

        //logical NOT 
         System.out.println(!((3<2 || (5<0))));
    }
    }

