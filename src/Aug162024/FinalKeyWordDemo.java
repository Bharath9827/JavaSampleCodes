package Aug162024;


//final - key word - can be used on variables, methods, class
//can't modify final variables
//can't extend final class

import java.awt.*;

public class FinalKeyWordDemo {

    final int a=10;

    //below - invalid
//    final int b;
//    b=10;
//    final int c;

    final void sample(){
        System.out.println("final method");
    }


    public static void main(String[] args) {
        FinalKeyWordDemo obj = new FinalKeyWordDemo();
        obj.sample();

    }
}
