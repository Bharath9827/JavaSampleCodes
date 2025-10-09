package Sept062024;


//Exception - unexpected event which disturb normal flow of program
//Exceptions - Checked(compile time) & Unchecked(run time)
public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        try{
            System.out.println("In try block 1");
            System.out.println(1/0);
            System.out.println("In try block 2");
        }
        catch (Exception e){
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
        //-----------------------------------------------------------------------------------
        try{
            throw new ArithmeticException("Throwing exception");
        }
        catch (Exception e){
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        //-----------------------------------------------------------------------------------

        //throws -> checked exceptions

    }

}
