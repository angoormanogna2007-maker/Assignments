public class cats {
    public static void main(String[] args){
        cat cat1 = new cat();
        cat1.name = "milo";
        cat1.age = 1;
        cat1.color = "black";

        cat1.eat();
        cat1.sleep();
        cat1.makeSound();
        

        cat cat2 = new cat();
        cat2.name = "kitty";
        cat2.age = 2;
        cat2.color = "white";

        cat2.eat();
        cat2.sleep();
        cat2.makeSound();
        
    }
    
}
