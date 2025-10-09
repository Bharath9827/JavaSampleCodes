package Aug16Oops;

//polymorphism - Ability to  Exhibit in different forms

    //method overloading - Speak() methods with diff params (same method name)
    //method overriding - In InheritanceDemo

public class PolymorphismDemo {
    public static void main(String[] args) {
        PolymorphismDemo obj = new PolymorphismDemo();
        obj.Speak();
        obj.Speak("John");
    }

    //method overloading
    public void Speak(){
        System.out.println("Blah blah blah");
    }

    public void Speak(String str){
        System.out.println("Hello "+ str);
    }


}
