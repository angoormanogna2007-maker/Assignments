public class Mobilee {
    public static void main(String[] args){
        mobile m1 =new mobile();
        m1.brand = "oneplus";
        m1.RAM = 12;
        m1.storage = 128;

        m1.call();
        m1.playGames();
        m1.sendMessage();
        System.out.println();

        mobile m2 = new mobile("samsung",12,256);
        m2.call();
        m2.playGames();
        m2.sendMessage();
    }
    
}

    
