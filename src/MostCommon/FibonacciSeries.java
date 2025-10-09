package MostCommon;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }
        System.out.println();
        System.out.println("---------------------");
        for(int i=0;i<n;i++){
            System.out.print(fibonacciOptimized(i)+" ");
        }
    }

    public static int fibonacci(int n){
        if(n<=1) return n;
        else return fibonacci(n-1)+fibonacci(n-2);
    }

    public static int fibonacciOptimized(int n){
        int res[] = new int[n+2];
        res[0] = 0;
        res[1] = 1;
        for(int i=2;i<=n;i++){
            res[i] = res[i-1]+res[i-2];
        }
        return res[n];
    }
}
