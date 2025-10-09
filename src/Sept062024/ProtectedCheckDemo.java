package Sept062024;


public class ProtectedCheckDemo extends MyProtectedClass {

    public static void main(String[] args) {
        MyProtectedClass myProtectedClass = new MyProtectedClass();
        //can access below  -  Same package
        System.out.println(myProtectedClass.protectedVar);
        myProtectedClass.protectedMethodDemo();
    }
}
