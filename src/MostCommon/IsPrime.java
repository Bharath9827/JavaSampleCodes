package MostCommon;

public class IsPrime {
    public static void main(String[] args) {
        int givenNum = 14;
        System.out.println(isPrime(givenNum));
    }

    public static boolean isPrime(int n){
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
