package Sept062024;

interface Motor{
    public int calculateSpeed(); //public abstract

    int a=10; //public static final

}


class Truck implements Motor{


    @Override
    public int calculateSpeed() {
        return 90;
    }
}

class Bike implements Motor{

    @Override
    public int calculateSpeed() {
        return 150;
    }
}

class InterfaceDemo{
    public static void main(String[] args) {
        Motor truck = new Truck();
        Motor bike = new Bike();
        System.out.println("Truck speed: "+truck.calculateSpeed());
        System.out.println("Bike speed: "+bike.calculateSpeed());
    }
}