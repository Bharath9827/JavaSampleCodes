package Sept112024;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        /*
        Set - Do not Mantain order of elements added and do not allow duplicates
        */
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);  //Duplicate will not be considered
        System.out.println(set); //insertion order not maintained
        //No random access by index
        System.out.println(set.remove(10));  //Time complexity for deletion is O(1) - Since it finds elements with hashcode
        System.out.println(set);


    }
}
