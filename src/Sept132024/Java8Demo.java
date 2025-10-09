package Sept132024;

@FunctionalInterface
interface Bharath{

    void m1();

    default void printMsg(){
        System.out.println("This is default method of func interface");
    }

    //void m2();  - Can't have 2nd abstract method in func interface

    //Can't be overridden
    static void display(){
        System.out.println("This is display method of Func Interface");
    }
}


public class Java8Demo implements Bharath{
    public static void main(String[] args) {

        /*Java 8 New features:
              1) Default methods in interface: Interfaces can have default methods with body
              2) Static Methods: Interfaces can have static methods with body but can't be overridden
              3) Functional Interface: Interface with only one abstract method.
                                     -> It can also have static and default methods with body.
                                            -> static methods can't be overridden, but default methods can be done.
                                            -> Classes which implements func interface need not implement default and
                                                                        static methods of functional interface

              4) Abstract method's implementation can be done using lambda expression
              * Lambda functions -> Functions without name

              5) Java has few predefined functional interfaces
                    Function<T, R>, Predicate<T>, Consumer<T>, Supplier<T>, UnaryOperator<T>
                    BinaryOperator<T>, BiFunction<T, U, R>, BiPredicate<T, U>, BiConsumer<T, U>

         */

        Bharath.display();  //calling static method

        //Implementation for abstract method:
        Bharath b = () -> System.out.println("This is implementation for method m1");
        b.m1();

        Thread thread = new Thread();
    }

    @Override
    public void m1() {

    }
}
