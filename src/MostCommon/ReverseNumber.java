package MostCommon;

public class ReverseNumber {

    public static void main(String[] args) {

        int a =1209;

        System.out.println(reverseNum(a));

        //using recursion:
        System.out.println(reverseNum(a,0));
    }

    public static int reverseNum(int n){
        int reverse = 0;
        while (n>0){
            reverse = reverse*10 + n%10;
            n=n/10;
        }
        return reverse;

    }

    public static int reverseNum(int num, int rev){
        if(num ==0){
            return rev;
        }
        return reverseNum(num/10,rev*10+num%10);
    }
}
