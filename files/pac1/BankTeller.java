package pac1;

public class BankTeller {
    public void deposit(BankAccount account,double amount){
        boolean result = account.deposit(amount);
        if (result){
            System.out.println("Successfully deposited "+amount+".");
        }
        else {
            System.out.println("Error occurred!!!");
        }
    }

    public void withdraw(BankAccount account,double amount){
        boolean result = account.withdraw(amount);
        if (result){
            System.out.println("Successfully withdrawn "+amount+".");
        }
        else {
            System.out.println("Error occurred!!!");
        }
    }
    public void transfer(BankAccount a,BankAccount b,double amount)
    {
        if (amount < a.getBalance()/2)
        {
            boolean result_w = a.withdraw(amount);
            if (result_w)
            {
                boolean result_d = b.deposit(amount);

                if (result_d)
                {
                    System.out.println("Transfer complete from A to B of amount "+amount+".");
                }
            }
            else {
                System.out.println("Can't transfer, error occured while transfer");
            }
        }
        else {
            System.out.println("Error. can't transfer more than 50% of balance.");
        }
    }
}
