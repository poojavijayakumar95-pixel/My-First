package tasks;

public class Account {
	
	    double balance;

	    Account() {
	        balance = 0;
	    }

	    Account(double b) {
	        balance = b;
	    }

	    void deposit(double a) {
	        balance = balance + a;
	    }

	    void withdraw(double a) {
	        balance = balance - a;
	    }

	    void show() {
	        System.out.println("Balance = " + balance);
	    }

	    public static void main(String[] args) {
	        Account acc = new Account(1000);
	        acc.deposit(500);
	        acc.withdraw(200);
	        acc.show();
	    }
	}

	


