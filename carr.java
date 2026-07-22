public class carr {
    public static void main(String[] args){
        car c1 = new car();
        c1.brand = "maruthi";
        c1.model = "swift";
        c1.start();
        c1.drive();
        c1.stop();
        System.out.println();
          
     car c2 = new car("hyundai","creta");
     c2.start();
     c2.drive();
     c2.stop();


    }
}
