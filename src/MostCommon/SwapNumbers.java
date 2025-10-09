package MostCommon;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 12;
        int b = 23;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a : "+a+" b : "+b);

        double a1 = 6/4;
        int b1 = 6/4;
        double c1 = a1+b1;
        System.out.println(c1);
    }
}
