package Sept132024;

import java.util.HashMap;
import java.util.Map;

public class ExampleProblems {
    public static void main(String[] args) {
        //int Arr[] ={10,20,20,30,10,40} Identify frequency of each element

        int arr[] = {10,20,30,20,10,40,45};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else map.put(i,1);
        }
        System.out.println(map);

        //------------------------------------------------------------

        //int arr[] = {2, 7, 11, 15} find pairs for which sum=9  (2 sum problem)
        int arr2[]={2, 7, 11, 15};
        Map<Integer,Integer> map2 = new HashMap<>();
        for(int i=0;i<arr2.length;i++){
            int diff = 9-arr2[i];
            if(map2.containsKey(diff)){
                System.out.println("Pair is: "+diff+", "+arr2[i]);
                break;
            }
            else{
                map2.put(arr2[i],i);
            }
        }

    }
}
