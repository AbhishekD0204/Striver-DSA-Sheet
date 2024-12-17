
public class BasicMath{
    
    public static int countDigits(int n){
        // Write your code here.
        int count = 0;
        while (n>0) {
            count++;
            n=n/10;
        }
    return count;
    }

    public static int reversenum(int n){
        int reverse = 0;
        while (n>0) { 
            int lastdigi = n%10;
            n=n/10;
            reverse =  ( reverse * 10 ) + lastdigi;
        }
        return reverse;
    }
    
    public static void palinCheck(int n){
        int reverse = 0;
        int temp = n;
        while (n>0) { 
            int lastdigi = n%10;
            n=n/10;
            reverse =  ( reverse * 10 ) + lastdigi;
        }
        if (reverse ==  temp) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }

    public static void main(String[] args){
        int n = 123;
       // System.out.println( countDigits(n));
       //System.out.println(reversenum(n));
        palinCheck(n);
    }
}