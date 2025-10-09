package Sept062024;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        List - Mantain order of elements added and allows duplicates
        Initial capacity of list - 10
         If 10 is filled: Then New capacity = (currentCapacity * 1.5) + 1
         ArrayList - Not thread safe
        */
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(10);
        System.out.println(list);
        System.out.println(list.get(2));
        Collections.sort(list);
        System.out.println(list);
        list.remove(Integer.valueOf(30));
        System.out.println("after removal");
        System.out.println(list);

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(12);
        list1.add(33);
        System.out.println(list1.addAll(list)); //returns boolean
        System.out.println(list1);
        System.out.println("List length/size: "+list1.size());
        System.out.println(list1.contains(10)); //returns boolean

        //Iterator
        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+", ");
        }


    }




    public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
        // Write your code here
        int errors=0;
        HashMap<String,Float> correctPrices = new HashMap<>();
        for(int i=0;i<products.size();i++){
            correctPrices.put(products.get(i),productPrices.get(i));
        }
        for(int i=0;i<productSold.size();i++){
            if(soldPrice.get(i)!=correctPrices.get(productSold.get(i))) errors++;
        }
        return errors;
    }
}
