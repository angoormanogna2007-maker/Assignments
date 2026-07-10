public class ternary {
    public static void main(String args[]){
        int num1 = 5;
        int num2 = 8;
        int age = 19;
        int marks = 75;
        System.out.println(num1 > 0 ? "positiveNumber" : "negativeNumber");
        System.out.println(num2 % 2 ==0 ? "evenNumber" : "oddNumber");
        System.out.println(age >= 18 ? "eligible to vote" : "not eligible to vote");
        System.out.println(marks >= 60 ? "pass": "fail");
    }
}
