public class Demoo {
    static String studentName = "Manogna";
    static int studentId = 13;
    static String collegeName = "Nishitha";
    static String Branch = "mpcs";
    static long mobileNumber = 6305446262l;
    
 public static void main(String[] args){
 studentDetails();
 changeStudentName("Angoormanogna");
 changeStudentId(22);
 changeCollegeName("ABC");
 changeBranch("mscs");
 changeMobileNumber(9440757627l);
 } 

 
 public static void studentDetails(){
 System.out.println("studentName: " + studentName);
 System.out.println("stdentId: " + studentId);
 System.out.println("collegeName: " + collegeName);
 System.out.println("Branch: " + Branch);
 System.out.println("mobileNumber: " + mobileNumber);
 
 }
 
 public static void changeStudentName(String newStudentName){
 studentName = newStudentName;
 System.out.println("studentName is updated to: "+ studentName);
 }
 public static void changeStudentId(int newStudentId){
 studentId = newStudentId;
 System.out.println("student Id is updated to: " + studentId);
 }
 public static void changeCollegeName(String newCollegeName){
 collegeName = newCollegeName;
 System.out.println("college name is updated to: " + collegeName);
 }
 public static void changeBranch(String newBranch){
 Branch = newBranch;
 System.out.println("Branch is updated to: " + Branch);
 }
 public static void changeMobileNumber(long newMobileNumber){
 mobileNumber = newMobileNumber;
 System.out.println("mobile number changed to: " + mobileNumber);
 }
 
 public static void checkStudentName(String enteredStudentName){
 if(enteredStudentName==studentName){
 System.out.println("student name updated");
 }else{
 System.out.println("student name not updated");
 } 
 }
 public static void checkStudentId(int enteredStudentId){
 if(enteredStudentId==studentId){
 System.out.println("student Id is updated");
 }else{
 System.out.println("student Id not updated");
 }
 }
 public static void checkCollegeName(String enteredCollegeName){
 if(enteredCollegeName==collegeName){
 System.out.println("college name is updated");
 }else{
 System.out.println("college name is not updated");
 }
 }
 public static void checkBranch(String enteredBranch){
 if(enteredBranch==Branch){
 System.out.println("Branch name is updated");
 }else{
 System.out.println("Branch name not updated");
 }
 }
 public static void checkMobileNumber(long enteredMobileNumber){
 if(enteredMobileNumber==mobileNumber){
 System.out.println("mobile number is updated");
 }else{
 System.out.println("mobile number is not updated");
 } 
 }
}







