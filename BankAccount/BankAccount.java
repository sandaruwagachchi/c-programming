public class BankAccount
 {
    String accountNumber;
    double balance;

public void deposit(double amount)
  { 
    balance=balance+amount;
    System.out.println("Deposited:$"+amount);
   
  }
public void withdraw(double amount)
  {
   if(amount<=balance)
     {
       balance-=amount;
       System.out.println("Withdrawn:$"+amount);
     }
   else
     {
       System.out.println("insufficient found");
     }
   }
public void displayAccountDetails()
   {
     System.out.println("Account Number:"+ accountNumber);
     System.out.println("-------------------------");
   }
public static void main(String[] args)
   { 
      BankAccount account=new BankAccount();
      account.accountNumber="123456";
      account.balance=100.00;
      account.displayAccountDetails();
      account.deposit(500.0);
      account.withdraw(200.0);
      account.displayAccountDetails();
   }
 }