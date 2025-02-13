import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class assingment1 {
    public static void main(String[] args) {

        ArrayList<Integer> lst = new ArrayList<Integer> ();
        lst.add(123);
        lst.add(456);
        lst.add(789);

        HashSet<String> mSet = new HashSet<String>();

        mSet.add("a");
        mSet.add("b");
        mSet.add("c");

        for (String string : mSet) {
            System.out.println(string);
        }
        for (Integer integer : lst) {
            System.out.println(integer);
        }
    }
}
