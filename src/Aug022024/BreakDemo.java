package Aug022024;

public class BreakDemo {
    public static void main(String[] args) {

        for(int i=0;i<=8;i++){
            if(i==5){
                //break;
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Ended");

    }
}
