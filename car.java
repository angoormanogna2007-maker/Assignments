public class car {
    String brand;
    String model;
    public car(){
    }
    car(String brand,String model){
        this.brand=brand;
        this.model=model;
    }
    void start(){
        System.out.println(brand + " " + model + " is starting");
    }
    void drive(){
        System.out.println(brand + " " + model + " is driving");
    }
    void stop(){
        System.out.println(brand + " " + model + " is stopping");
    } 
    
}

    
    
