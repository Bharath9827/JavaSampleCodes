package MostCommon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysWithSameElements {

    public static void main(String[] args) {
        Integer[] a1 = {1,2,3,2,1};
        Integer[] a2 = {1,2,3};
        Integer[] a3 = {1,2,3,4};

        System.out.println(sameElements(a1,a2));
        System.out.println(sameElements(a2,a3));

        int[] a11 = {1,2,3,2,1};
        int[] a22 = {1,2,3};
        int[] a33 = {1,2,3,4};
        System.out.println(hasSameElements(a11,a22));
        System.out.println(hasSameElements(a33,a22));
    }

    public static boolean sameElements(Integer arr1[], Integer arr2[]){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
        if(set1.size() != set2.size()) return false;
        for(Integer num: set1){
            if(!set2.contains(num)) return false;
        }

        return true;
    }

    public static boolean hasSameElements(int arr1[], int arr2[]){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i: arr1){
            set1.add(i);
        }
        for(int i: arr2){
            set2.add(i);
        }
        if(set1.size() != set2.size()) return false;
        for(int num: set1){
            if(!set2.contains(num)) return false;
        }
        return true;
    }
}
