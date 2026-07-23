public class Studentt {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "sowmya";
        s1.age = 18;
        s1.study();
        s1.introduce();
        s1.grade();

     Student s2 = new Student("spandana",19);
       s2.study();
       s2.introduce();
       s2.grade();

    }
    
}
