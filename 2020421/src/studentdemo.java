import java.util.ArrayList;

public class studentdemo {
    public static void main(String[] args) {
        ArrayList<stunent> s = new ArrayList<>();
        s.add(new stunent("张三",11));
        s.add(new stunent("李四",12));
        s.add(new stunent("王五",13));
        s.add(new stunent("赵六",14));
        for (stunent stunent : s) {
            System.out.println(stunent);
        }

    }
}
