public class studenttt {
  private String name;
  private int age;
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
    public static void main(String[] args){
        studenttt s1 = new studenttt();
        s1.setName("manogna");
        s1.setAge(19);
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }

    }

    
  

  


    

