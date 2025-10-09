package Sept062024;

import java.util.HashMap;
import java.util.Map;

public class VarArgsDemo {
    public static void main(String[] args) {
        sum(10,10);
        sum(10,10,10);
        sum(10,10,10,10);
    }

    public static void sum(int... args){ //here args is array
        int res=0;
        for(int i:args){
            res=res+i;
        }
        System.out.println("Sum is: "+res);
    }
}
