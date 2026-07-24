public class mobile{
    String brand;
    int RAM;
    int storage;

    public mobile(){
    }
    public mobile(String brand,int RAM,int storage){
        this.brand = brand;
        this.RAM = RAM;
        this.storage = storage;
    }
    public void call(){
        System.out.println(brand + "is making a call" );
    }
    public void playGames(){
        System.out.println(brand + " is playing games");
    }
   public void sendMessage(){  
    System.out.println(brand + " is sending a message");
}
}


