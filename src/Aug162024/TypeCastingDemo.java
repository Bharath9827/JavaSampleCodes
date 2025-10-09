package Aug162024;

public class TypeCastingDemo {
    public static void main(String[] args) {

        //widening - implicit conversion (casting)
        int num=10;
        double db = num;
        System.out.println("Double value of int: "+db);


        //narrowing - explicit conversion(casting)
        double data = 112.5;
        int intData = (int) data;
        System.out.println("Int value of double: "+intData);

        //Type casting w.r.t to reference type - converting object of one type to another
        //Example in UpDownCastingDemo class
    }
}
