package MostCommon;

public class Palindrome {
    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "hello";
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));

    }

    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
                return false;
        }
        return true;
    }
}
