import java.util.ArrayList;

public class three {


    public static void main(String[] args) {
        ArrayList list = new ArrayList();


        list.add(new Person("aa",11));
        list.add(new Person("bb",22));
        list.add(new Person("cc",33));
        for (int i = 0; i < list.size(); i++) {
            Person o = (Person)list.get(i);
            System.out.println(o);

        }



    }
}
