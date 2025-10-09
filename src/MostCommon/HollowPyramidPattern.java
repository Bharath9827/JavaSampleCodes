package MostCommon;

public class HollowPyramidPattern {

    public static void main(String[] args) {
        int n=5;
//        1
//        12
//        1 3
//        1  4
//        12345

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i || i==n){
                    System.out.print(j);
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
