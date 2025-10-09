package Sept132024;

import java.util.function.Predicate;

//Predicate Interface: Has a method test which return boolean

public class PredicateDemo {
    public static void main(String[] args) {

        //Ex 1: Predicate usage
        Predicate<String> p = (s -> s.length()>0);
        System.out.println(p.test("ABCD"));

        //Ex 2: Predicate usage
        int arr[] = {1,2,3,4,5,6,7,8};
        Predicate<Integer> p1 = (num -> num%2==0);
        Predicate<Integer> p2 = (num -> num%2!=0);
        Predicate<Integer> p3 = (num -> num>4);
        //display(p1,arr);  //gets even nums
        //display(p2,arr);  //gets odd nums
        //display(p1.or(p2),arr); //gets all
       // display(p1.and(p3),arr);  //gets even nums>4
        display(p1.negate(),arr);  //gets odd (Not even)

    }

    public static void display(Predicate<Integer> predicate, int[] arr){
        for(int i:arr){
            if(predicate.test(i)) System.out.println(i);
        }
    }

}
