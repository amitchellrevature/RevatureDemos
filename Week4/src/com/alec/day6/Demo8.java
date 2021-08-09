package com.alec.day6;

interface IBank {
    void deposit(int amount);

    void withdraw(int amount);
}

class SavingAccount implements IBank {

    @Override
    public void deposit(int amount) {
        System.out.println("deposit amount: " + amount);
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("withdraw amount: " + amount);
    }
}

class CurrentAccount implements IBank {
    @Override
    public void deposit(int amount) {
        System.out.println("deposit amount: " + amount);
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("withdraw amount: " + amount);
    }
}

class LoanAccount implements IBank {
    @Override
    public void deposit(int amount) {
        System.out.println("deposit amount: " + amount);
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("withdraw amount: " + amount);
    }
}

class Factory {
    public static IBank getAccount(AccountType id) {
        switch (id) {
            case SAVING_ACCOUNT:
                return new SavingAccount();
            case CURRENT_ACCOUNT:
                return new CurrentAccount();
            case LOAN_ACCOUNT:
                return new LoanAccount();
            default:
                return null;
        }
    }
}

enum AccountType {
    SAVING_ACCOUNT,
    CURRENT_ACCOUNT,
    LOAN_ACCOUNT
}

public class Demo8 {
    public static void main(String[] args) {
//        SavingAccount account = new SavingAccount();
//        CurrentAccount account1 = new CurrentAccount();
        IBank account = Factory.getAccount(AccountType.SAVING_ACCOUNT);
        account.deposit(1000);
        account.withdraw(500);
    }
}
