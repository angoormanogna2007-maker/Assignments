public class Demoo {
    static String studentName = "Manogna";
    static int studentId = 13;
    static String collegeName = "Nishitha";
    static String branch = "mpcs";
    static long mobileNumber = 6305446262l;
     public static void main(String args[]){
    
        changeStudentName();
        changeStudentId();
        changeCollegeName();
        changeBranch();
        changeMobileNumber();
        checkStudentName("Angoor Manogna");
        checkStudentId(22);
        checkCollegeName("Nishitha Degree college");
        checkBranch();
        checkMobileNumber();
    
     }
     
    public static void changestudentName(){
        if(oldstudentName = studentName)
        System.out.println("studentName updated");
    }else{
        System.out.println("studentName is not updated");
    }
    public static void changesStudentId(){
        studentId = 22;
        System.out.println("studentId is updated");
    }
    public static void changecollegeName(){
        collegeName = "Nishitha Degree college";
        System.out.println("collegeName is updated");
    }






}
