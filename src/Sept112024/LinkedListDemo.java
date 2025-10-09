package Sept112024;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println(linkedList);

//        System.out.println(linkedList.get(1));  // Slower access of elements: Since it needs to traverse through elements
    }
}
