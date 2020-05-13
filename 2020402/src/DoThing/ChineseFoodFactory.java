package DoThing;

public class ChineseFoodFactory implements FoodFactory {


    @Override
    public Food makeFood(String name) {
        if(name.equals("A")){
            return new ChineseFoodA();
        }else if(name.equals("B")){
            return new ChineseFoodB();
        }else{
            return null;
        }

    }

    public static void main(String[] args) {
        ChineseFoodFactory factory = new ChineseFoodFactory();
        Food a = factory.makeFood("A");
        System.out.println(a);
    }
}
