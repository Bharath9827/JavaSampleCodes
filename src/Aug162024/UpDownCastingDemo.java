package Aug162024;

class Parent{
    void Display(){
        System.out.println("Parent class display");
    }
}

class Child extends Parent{
    void Display(){
        System.out.println("Child class display");
    }
}

public class UpDownCastingDemo {

    public static void main(String[] args) {
        Parent p = new Parent();
        p.Display();

        p = (Parent) new Child();   //child to parent - UpCasting
        p.Display();

        Child c = (Child) p;  // parent to child - Down Casting
        c.Display();
    }
}

