package MostCommon;

public class SecondLargestInString {

    public static void main(String[] args) {
        String s="dfa123210afd";
        int largest = -1;
        int secondLargest = -1;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int dig = Character.getNumericValue(s.charAt(i));
                if(dig>largest){
                    secondLargest = largest;
                    largest=dig;
                }
                else if(dig>secondLargest && dig !=largest){
                    secondLargest=dig;
                }
                if(dig<smallest){
                    secondSmallest=smallest;
                    smallest=dig;
                }
                else if(dig<secondSmallest && dig != smallest){
                    secondSmallest=dig;
                }
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);

        System.out.println(smallest);
        System.out.println(secondSmallest);
    }
}
