class Account{
    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public Account(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }

    public double  getBalance(){
        return balance;
    }

    public void deposite(double amount){
        if( amount > 0){
            balance += amount;
            System.out.println("Deposited " + amount);
        } else {
            System.out.println("Invalid amount to deposite");
        }
    }

    public String toString() {
        return "Account[" + accountNumber + ", Holder: " + accountHolderName + ", Balance: " + balance + "]";
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <=balance){
            balance -= amount;
            System.out.println("Withdraw :" + amount);
        } else {
            System.out.println("Insufficient balance in the account.");
        }
    }


}

public class bankAccount {
    public static void main(String[] args) {
        Account acc = new Account(87654,"Unknown",5000.75);

        System.out.println(acc);
        acc.deposite(17000);
        acc.setAccountHolderName("Raja");
        acc.withdraw(20000);
        System.out.println("Balance :"+acc.getBalance());
        System.out.println("Account Number :" + acc.getAccountNumber());
        System.out.println(acc);

    }
    
}
