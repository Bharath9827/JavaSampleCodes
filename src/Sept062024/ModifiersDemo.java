package Sept062024;


//private - Limited to class
//Default - Limited to Package
//Protected - Class & Subclass under same package, and diff package under sub class
//Public - Anywhere

class MyPrivateDemo{
    private int privateVar=10;
    private void privateMethodDemo(){
        System.out.println("This is private method");
    }
}

class MyDefaultDemo{
    int defaultVar = 20;
    void defaultMethodDemo(){
        System.out.println("This is default method");
    }
}

class MyProtectedClass{
    protected int protectedVar = 30;
    protected void protectedMethodDemo(){
        System.out.println("This is protected method");
    }
}

public class ModifiersDemo {

    public static void main(String[] args) {

        MyPrivateDemo myPrivateDemo = new MyPrivateDemo();
        //Can't access below - Scope limited to same class
        //myPrivateDemo.privateVar
        //myPrivateDemo.privateMethodDemo();

        MyDefaultDemo myDefaultDemo = new MyDefaultDemo();
        //can access below - Scope limited to same package - can't access outside of this package
        System.out.println(myDefaultDemo.defaultVar);
        myDefaultDemo.defaultMethodDemo();

        MyProtectedClass myProtectedClass = new MyProtectedClass();
        //can access below
        System.out.println(myProtectedClass.protectedVar);
        myProtectedClass.protectedMethodDemo();
    }
}
