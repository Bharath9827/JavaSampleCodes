package Aug16Oops;

import java.text.FieldPosition;

class Forest{
    String forestName;
    void makeSound(){
        System.out.println("Forest Sounds");
    }
}

class Dog extends Forest{
    String forestName;
    //Method overriding
    void makeSound(){
//        super.forestName = "Amazon";
//        forestName="Thar";
//        System.out.println("Super name "+super.forestName+" Child name: "+this.forestName);
        System.out.println("Bow Bow!!");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.makeSound();

        Dog dog = new Dog();
        dog.makeSound();  //Bow Bow!!

        Forest forest1 = new Dog();
        forest1.makeSound();  //Bow Bow!!
    }
}

