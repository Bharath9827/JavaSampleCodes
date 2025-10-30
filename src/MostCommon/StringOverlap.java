package MostCommon;

public class StringOverlap {

    public static void main(String[] args) {
//        System.out.println(resultOfOverlap("abbcxxxdd1234bab", "bab12345deftt"));
//        System.out.println(resultOfOverlap("teas","spoon"));
        System.out.println(resultOfOverlap("spoon","teas"));

    }


    public static String resultOfOverlap(String s1, String s2){
        String result1="",result2="";
        for (int i = Math.min(s1.length(), s2.length()); i > 0; i--) {
            if (s1.substring(s1.length() - i).equals(s2.substring(0, i))) {
                result1 = s1 + s2.substring(i);
            }
        }
        for (int i = Math.min(s1.length(), s2.length()); i > 0; i--) {
            if (s2.substring(s2.length() - i).equals(s1.substring(0, i))) {
                result2 = s2 + s1.substring(i);
            }
        }
        System.out.println("result1: "+result1);
        System.out.println("result2: "+result2);
        return s1+s2;
    }
}
