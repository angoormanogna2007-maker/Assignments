public class Student {
    String name;
    int age;
    public Student(){

    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    void study(){
        System.out.println(name +" is studying");
    }
    void introduce(){
        System.out.println(name +" introducing herself");
    }
    void grade(){
        System.out.println(name +" grade is  A");
    }
}
