public class BankAccount {
    double balance;
    public BankAccount(double IntialBalance){
        balance=IntialBalance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("deposied:" + amount);
        }
        else{
            System.out.println("inalid");
        }
    }
    public void withdraw(double amount){
        balance -= amount;
        if(amount>0 && balance<=0){
        System.out.println("withdraw: " + amount);
    }
    else if(amount > balance){
System.out.println("invalid withdraw");
    }
    else{
        System.out.println("invalid");
    }
}
    public void checkBalance(){
        System.out.println("current balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount ac=new BankAccount(3000);
        ac.checkBalance();
        ac.deposit(2000);
        ac.withdraw(4000);
        ac.withdraw(90000);
        ac.checkBalance();
    }
    
}
