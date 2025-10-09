package Aug022024;

//Array - collection of elements of same data type
//size of array - fixed

public class ArrayDemo {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int arr2[] = new int[]{1,2,3};
        int arr3[] = {1,2,3,4,1,9,5};
        //length
        int arrLength = arr.length;
        System.out.println(arrLength);

        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

        //forEach
        for(int i:arr2){
            System.out.println(i);
        }

        //max element
        int max=arr3[0];
        for(int i:arr3){
            max=max<i ? i : max;
        }
        System.out.println("max ele: "+max);


        //3D array - Matrix multiply
        int a[][] = {{1,1,1},{2,2,2},{3,3,3}};
        int b[][] = {{1,1,1},{2,2,2},{3,3,3}};
        int c[][] = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++) {
                    c[i][j] += a[i][k] * b[k][i];
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }



    }
}
