package MostCommon;

public class PrimeNumsList {
    public static void main(String[] args) {
        int n=50;

        for(int i=0;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }
        if(n==2) return true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
