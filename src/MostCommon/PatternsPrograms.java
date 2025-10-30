package MostCommon;

public class PatternsPrograms {

    public static void main(String[] args) {

        /*
                *
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * *
         */

        int rows = 5;
        for(int i=1;i<=rows;i++){
            //spaces block
            for(int j=rows-i;j>=0;j--){
                System.out.print(" ");
            }
            //stars block
            for(int k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
