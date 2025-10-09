package Sept132024;

import java.util.*;


public class VectorDemo {
    public static void main(String[] args) {

        /*
        Initial capacity of list - 10
         If 10 is filled: Then New capacity = (currentCapacity * 2)
         Vector - thread safe
        */

        Vector<Integer> vector = new Vector<>();
        System.out.println(vector.capacity());
        for(int i=0;i<10;i++){
            vector.add(i);
        }
        System.out.println(vector.capacity());
        vector.add(11);
        System.out.println(vector.capacity());
        vector.addElement(12);  //addElement returns void, add returns boolean

        //----------------------------------------------------------------------------------------

        //Vector enumeration  (Like iterator for array lists)
        Enumeration<Integer> enumeration = vector.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        //---------------------------------------------------

        //Array List - iterator
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(12);
        list1.add(33);
        //Iterator
        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+", ");
        }

        //----------------------------------------------------
        //List - ListIterator
        ListIterator<Integer> listIterator = list1.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
            //System.out.println(listIterator.previous());
        }

        //ListIterator is bi-directional - next(), previous()
        //Iterator & Enumeration can traverse only forward

        //Enumeration - Applied for Legacy classes - Ex: Vector, Operations- Only Read
        //Iterator - Applies for all, Operations - Read & Remove
        //ListIterator - Only for List, Operations - Read, Remove, Replace

    }
}
