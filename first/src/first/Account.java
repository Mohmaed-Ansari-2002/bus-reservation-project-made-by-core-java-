package first;
import java.util.*;

// Custom exception class for insufficient funds
class InsufficientFundException extends Exception {
    int amt;

    InsufficientFundException(int a) {
        amt = a;
    }


   
}

public class Account {
    int bal;

    public Account(int initialBalance) {
        this.bal = initialBalance;
    }

    // Method to withdraw money
    public void withdraw(int amount) {
        try {
            if (amount > bal) {
                throw new InsufficientFundException(amount - bal);
            } else {
                bal -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + bal);
            }
        } catch (InsufficientFundException e) {
            System.out.println("not enough monry");
        }
        finally {
        	System.out.println("this line executed both if error come sor not");
        }
    }

    public static void main(String[] args) {
        Account acc = new Account(500); // Creating an account with an initial balance of 500

        acc.withdraw(400); // Attempting to withdraw 600
    }
}
