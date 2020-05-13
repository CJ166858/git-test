import java.util.ArrayList;

public class ProxyBuy implements buy {
 buyHouse b= new buyHouse();

    @Override
    public void buy() {
        seeHouse();

        b.buy();
        pay();


    }
    public void seeHouse(){
        System.out.println("买房前");
    }
    public void pay(){
    System.out.println("买房后");
    }
}
