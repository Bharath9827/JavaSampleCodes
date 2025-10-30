package MostCommon;

import java.util.*;

public class DuplicatesInList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,5,7,7,8,7,12,0,0,1));
        List<Integer> result = new ArrayList<>();
        Map<Integer,Boolean> map = new HashMap<>();
        for(int val : list){
            if(map.containsKey(val)){
                map.put(val,true);
            }
            else map.put(val, false);
        }
        for(int key: map.keySet()){
            if(map.get(key)){
                result.add(key);
            }
        }
        System.out.println(result);
    }
}
