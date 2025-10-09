package Sept132024;

import java.util.function.Function;


public class FunctionDemo {
    public static void main(String[] args) {
        //Function<T, R>  : Takes T type and return R type
        Function<String,Integer> function = (s -> s.length());
        System.out.println(function.apply("Bharath"));

    }
}
