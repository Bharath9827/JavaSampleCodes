package MostCommon;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharsOfStr {
    public static void main(String[] args) {
        String str = "abcdabcdefabc";
        //output should be:  abcdef
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();

        //HashSet - do not allow duplicates, but doesnt maintain insetion order
        //LinkedHashSet - do not allow duplicates and maintains insertion order

        char[] arr = str.toCharArray();
        for(char ch:arr){
            set.add(ch);
        }
        for(char ch:set){
            sb.append(ch);
        }

        System.out.println(sb);
    }
}
