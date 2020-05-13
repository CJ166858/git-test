public class single {
   private static single s= new single();
   private single(){

   };
   public static single getInstanle(){
       return s;
   }
   public void make(){
       System.out.println("你好");
   }

}
