package MostCommon;

import java.util.HashSet;
import java.util.Set;

class A{
  public void add(){
      System.out.println("Add method in class A");
  }

  public void addA(){
      System.out.println("Add method specific to class A");
  }
}

class B extends A{
    public void add(){
        System.out.println("Add method in Class B");
    }

    public void multiply(){
        System.out.println("Multiply method in class B");
    }
}


public class InheritanceEx {

    public static void main(String[] args) {

        A a1 = new A();
        a1.add();


        B b1 = new B();
        b1.add();
        b1.multiply();


        A a3 = new B();
        a3.add();   //-> call method in class B

        //a3.multiply();  - Not allowed

       // B b2 = new A();  - Not allowed

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set);

    }
}
