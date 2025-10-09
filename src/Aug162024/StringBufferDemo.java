package Aug162024;

//StringBuffer - mutable, String - immutable
//StringBuffer - thread safe - Sychronized - can't call 2 methods of stringbuffer simultaneously
public class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("bharath");
        sb.append(" chandra");
        System.out.println(sb);

        //reverse
        sb.reverse();
        System.out.println(sb);

        //replace
        sb.replace(1,2,"abc");
        System.out.println(sb);

        //insert
        sb.insert(2,123);
        sb.insert(2,"abc");
        System.out.println(sb);

        System.out.println(sb.capacity());
    }
}
