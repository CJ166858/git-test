import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class dd {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("cba"); list.add("aba"); list.add("sba"); list.add("nba");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(0)-o2.charAt(0);
            }
        });
        System.out.println(list);
    }
}
