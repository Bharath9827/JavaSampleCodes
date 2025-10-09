package MostCommon;

//Reverse a string
public class StringReverse {

    public static void main(String[] args) {
        String givenStr = "Hello World..";

        StringBuilder result = new StringBuilder();
        for(int i=givenStr.length()-1;i>=0;i--){
            result.append(givenStr.charAt(i));
        }

        System.out.println(result);

        StringBuilder sb = new StringBuilder(givenStr);
        sb.reverse();
        System.out.println(sb);

    }
}
