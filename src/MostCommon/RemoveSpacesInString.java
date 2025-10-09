package MostCommon;

public class RemoveSpacesInString {

    public static void main(String[] args) {
        String str = "Hello World! This is Java";
        StringBuilder res = new StringBuilder();
        char ch[] = str.toCharArray();
        for(char c : ch){
            if(!Character.isWhitespace(c)){
                res.append(c);
            }
        }
        System.out.println("Result is: "+res);
    }
}
