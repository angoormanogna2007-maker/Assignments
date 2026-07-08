public class ATM {
    static String bankName = "skills sprint";
    static long accountNumber = 6875439264l;
    static String accountHolderName ="Manogna";
    static long mobileNumber = 6305446262l;
    static int Balance = 20000;
    static int pin = 4215;

    public static void main(String[] args){
        welcome();
        checkBalance();    
        checkPin(5258);
        deposit(500);
        withdraw(1000);
        checkBalance();
        checkPin(9848);
        changeAccountNumber(98765432195l);
        changeName("Angoor Manogna");
        changemobileNumber(9440757627l);
        changeBankName("union bank");

        
    }
    public static void welcome(){
        System.out.println("welcome to :" + bankName);
        System.out.println("accountNumber :" + accountNumber);
        System.out.println(" accountHolderName :" + accountHolderName);
        System.out.println("mobileNumber :" + mobileNumber);
 
}
    
    public static void deposit(int amount){
        Balance += amount;                                       
        System.out.println("Deposit: " + amount);               
        System.out.println("Updated Balance: " + Balance);       
 
    }
    public static void withdraw(int amount){
        if(amount<=Balance){
            Balance-=amount;
            System.out.println("withdraw: " + amount);            
            System.out.println("Updated Balance: " + Balance);    
        }else{
            System.out.println("Insufficient funds: ");
        }
    }
    public static void checkBalance(){
        System.out.println("current Balance: "+ Balance);
    }    
    public static void checkPin(int enteredPin){
        if(enteredPin == pin){
            System.out.println("Pin is correct");
        }else{
            System.out.println("Pin is incorrect");
        }
    }
    public static void changeAccountNumber(long newNumber){
        accountNumber = newNumber;
        System.out.println("account number is changed to: " + accountNumber);
    }
    public static void changePin(int newPin){
        pin = newPin;
        System.out.println("pin is changed to: " + pin);
    }
    public static void changeName(String newaccountHolderName){
        accountHolderName = newaccountHolderName;
        System.out.println("account Holder name is changed to: " + accountHolderName);
    }  
    public static void changemobileNumber(long newNumber){
        mobileNumber = newNumber;
        System.out.println("mobile number is changed to: " + mobileNumber);
    }
    public static void changeBankName(String newBankName){
        bankName = newBankName;
        System.out.println("Bank name is changed  to: " + bankName);
    }
 
}
 
 

    



