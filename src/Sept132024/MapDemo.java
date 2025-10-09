package Sept132024;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //HashMap default capacity -16 - Doubles if 75% is filled (12)
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Varun");
        map.put(2,"Ajay");
        map.put(3,"Arav");
        //map.put(null,"nullvalue");

        System.out.println(map);
        map.put(3,"Geetha");
        System.out.println(map);  //No duplicate keys - value replaced
        //System.out.println(map.get(null));

        //Iterator for Maps - Entry Set
        Iterator<Map.Entry<Integer,String>> iterator =map.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Iterator<Integer> keySetIterator = map.keySet().iterator();
        while (keySetIterator.hasNext()){
            int key = keySetIterator.next();
            System.out.println("key = "+key);
            System.out.println("Value = "+map.get(key));
        }

        //Achieve above with java 8
        System.out.println("Using java8");
        map.keySet().stream().forEach(key -> System.out.println(key));


        int result[] = twoSum(new int[]{1, 2, 3}, 5);
        System.out.println("Two sum result");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // Return an empty array if no solution is found
        return new int[] {};
    }
}
