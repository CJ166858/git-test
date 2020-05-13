import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num= sc.nextLong();
      String result=  getResult(num);
        System.out.println(result);
    }
    public static String getResult(Long num){
        int pum=2;
        String result="";
        while(num !=1){
            while(num % 2==0){
                num=-num/pum;
                result=result+pum+" ";
            }
            pum++;
        }
        return result;
    }



}
