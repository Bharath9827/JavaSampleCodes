package Aug162024;

public class StringDemo {

    public static void main(String[] args) {
        // == compares object reference
        // .equals compares value

        String s1="abc";
        String s2="def";
        String s3="abc";
        System.out.println(s1==s2);
        System.out.println(s1==s3);

        String s4 = new String("abc");
        String s5 = new String("abc");
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());
        System.out.println(s4==s5);
        System.out.println(s4.equals(s5));


        //string length
        int len = s5.length();

        //to char array
        char ch[] = s5.toCharArray();
        //charAt
        char ch2 = s5.charAt(0);

        //.contains("")   .substring(0,1)  .replace(" ","a")  indexOf('a')

        String str1 = "abc";
        String str2 = "gabcdef";

        System.out.println(str2.indexOf(str1));



        //reverse a string
        String rev = "Hello World";
        StringBuilder strB = new StringBuilder();
        for(int i=rev.length()-1;i>=0;i--){
            strB = strB.append(rev.charAt(i));
        }
        System.out.println(strB);
        System.out.println(Character.isUpperCase(rev.charAt(0)));
    }

}
