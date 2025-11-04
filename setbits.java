public class setbits {
   public static int countSetBits(int n) {
    int count = 0;
    while(n > 0) {
        if((n & 1) != 0) { //check our LSB  n -> log(n)base 2 + 1;
            count++;
        } 
        n = n>> 1; //right shift
    }
    return count;
   } 
   public static void main(String[] args) {
       System.out.println(countSetBits(15));
   }
}
