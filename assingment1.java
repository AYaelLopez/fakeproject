import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class assingment1 {
    public static void main(String[] args) {

        ArrayList<Integer> lst = new ArrayList<Integer> ();
        lst.add(123);
        lst.add(456);
        lst.add(789);

        HashSet<String> hSet = new HashSet<String>();

        hSet.add("a");
        hSet.add("b");
        hSet.add("c");

        HashMap<String, Boolean> mSet = new HashMap<String, Boolean>();

        mSet.put("evil", false);
        mSet.put("kindness", true);
        mSet.put("hope", null);


        for (String str : hSet) {
            System.out.println(str);
        }
        for (Integer intg : lst) {
            System.out.println(intg);
        }
        mSet.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }); 
    }
}
