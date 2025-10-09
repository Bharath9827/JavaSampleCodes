package Aug16Oops;

public class InstanceVarDemo {
    //variables declared inside class and outside all methods - instance variables
    //Need to create object to access instance variables (If non-static)
    int a =1;
    int b;
    //static instance var
    static int c =10;

    public static void main(String[] args) {
        InstanceVarDemo instObj = new InstanceVarDemo();
        System.out.println(instObj.a);
        System.out.println("cvalue is "+c);
        instObj.a = 20;
        System.out.println(instObj.a);

        InstanceVarDemo instObj2 = new InstanceVarDemo();
        System.out.println(instObj2.a);  //a will be 1 - since instObj2 is diff obj. If instance var is non-static - Each object share diff copy(value)

        instObj.c = 200;
        System.out.println(instObj.c);

        System.out.println(instObj2.c);  // c will be 200 - If instance var is static - Each object share same copy (value)
        InstanceVarDemo instObj3 = new InstanceVarDemo();
        instObj3.main2();
    }

    public void main2(){
        System.out.println("Non static block accessing instance var : "+a);
    }
}
