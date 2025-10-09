package Sept062024;


class Demo extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Run method demo class");
        }

    }
}

public class ThreadsDemo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.start();
        for(int i=0;i<10;i++){
            System.out.println("Main method");
        }
    }
}
