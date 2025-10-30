package MostCommon;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog dog dog dog"));
    }
    public static boolean wordPattern(String pattern, String s) {
        char ptn[] = pattern.toCharArray();
        String strArr[] = s.split(" ");

        if(ptn.length !=strArr.length) return false;

        Map<Character,String> map = new HashMap<>();

        for(int i=0;i<ptn.length;i++){
            if((map.containsKey(ptn[i]) && !map.get(ptn[i]).equals(strArr[i])) ||
                    (!map.containsKey(ptn[i]) && map.containsValue(strArr[i]))
            ){
                return false;
            }

            else if(!map.containsKey(ptn[i])){
                map.put(ptn[i],strArr[i]);
            }
        }
        return true;
    }
}
