

import java.util.ArrayList;
import java.util.List;

public class demo {
    public void read(String str) {


        List<String> list = new ArrayList<String>();



        list.add("牛魔王");
        list.add("蛟魔王");
        list.add("美猴王");
        for (String s : list) {
            if(str==s){
                System.out.println(s);
            }
            else{
                System.out.println("错误");
            }
        }


        }


    public static void main(String[] args) {
        demo d1 = new demo();
        d1.read("王");


    }
}
