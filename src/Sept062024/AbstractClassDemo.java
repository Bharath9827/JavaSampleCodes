package Sept062024;

//class declared with keyword abstract - Abstract class
//Abstract class may or may not have abstract methods
//Can't create object for abstract class  - But can have constructor (Reason- To access/initialize constructor)
//Used for Abstraction

//Abstract method - Declared using abstract keyword - Without method body
//This methods body will be defined by its subclass
//Abstract methods cannot be final or static
//Classes extending abstract class must implement parent class abstract methods

abstract class Vehicle{
    public abstract void engine();
    public void Tyres(){}
}

public class AbstractClassDemo extends Vehicle{

    @Override
    public void engine() {
        System.out.println("Car Engine!!");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new AbstractClassDemo();
        vehicle.engine();
    }
}
