package Inloop.Exam.Bank_Account;

public class BankAccount {

    private double balance = 0.0;
    private double lineOfCredit;
    private String accountNumber;
    private AccountState state;

    public BankAccount(String accountNumber, double lineOfCredit) {

        if (accountNumber.isEmpty()) {throw new IllegalArgumentException();}

        this.accountNumber = accountNumber;
        this.lineOfCredit = lineOfCredit;
        this.state = new Positive();

    }

    public boolean payIn(double amount) {

        if (amount <= 0) {throw new IllegalArgumentException();}

        return state.payIn(amount);

    }

    public boolean payOff(double amount) {

        if(balance < 0) {state = new Negative();}
        if(balance <= lineOfCredit) {state = new Frozen();}

        if (amount <= 0) {throw new IllegalArgumentException();}

        return state.payOff(amount);

    }

    public boolean close() {

        System.out.println(balance);

        if (balance == 0) {

            System.out.println(balance);

            state = new Closed();
            return true;

        }

        return false;
        //throw new IllegalArgumentException();

    }

    public double getBalance() {return balance;}

    public String getState() {

        if(balance < 0) {state = new Negative();}


        return state.toString();

    }

    public String getAccountNumber() {return accountNumber;}

    public void printBalance() {state.printBalance();}

    public void payInterest() {state.payInterest();}

    private void setState(AccountState ac) {state = ac;}

    public abstract class AccountState {

        public boolean payIn(double amount) {

            if(balance < 0) {state = new Negative();}
            if(balance <= lineOfCredit) {state = new Negative();}

            return true;
        }

        public boolean payOff(double amount) {

            if(balance < 0) {state = new Negative();}
            if(balance <= lineOfCredit) {state = new Negative();}

            return true;


        }

        public String toString() {return getClass().getSimpleName();}

        public void payInterest() {
        }

        public abstract void printBalance();

    }

    public class Positive extends AccountState {


        public boolean payIn(double amount) {

            balance += amount;
            return true;

        }

        public boolean payOff(double amount) {

            if (balance < lineOfCredit) {return false;}

            balance -= amount;
            return true;

        }

        public void payInterest() {balance *= 1.01;}

        public void printBalance() {

            System.out.println("Balance is POSITIVE: +" + balance + ".");

        }
    }

    public class Negative extends AccountState {

        public boolean payIn(double amount) {

            balance += amount;
            return true;

        }

        public boolean payOff(double amount) {

            if ((balance -= amount) < lineOfCredit) {return false;}

            balance -= amount;
            return true;

        }

        public void payInterest() {
        }

        public void printBalance() {
        }

    }

    public class Frozen extends AccountState {

        //public boolean payIn(double amount) {}


        public void payInterest() {
        }

        public void printBalance() {
        }

    }

    public class Closed extends AccountState {

        public void printBalance() {

            System.out.println("This account is CLOSED. The balance is " + (int) balance + ".");

        }

    }

}

