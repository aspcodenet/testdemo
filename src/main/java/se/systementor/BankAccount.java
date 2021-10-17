package se.systementor;

import java.util.ArrayList;
import java.util.List;


public class BankAccount {
      
  private String kontonummer;
  private String personNumber;
  private int saldo;
  private ArrayList<AccountTransaction> accountTransactions = new ArrayList<>();


    public BankAccount(String kontonummer, String personNumber ){
        super();
        this.kontonummer = kontonummer;
        this.personNumber = personNumber;
        saldo = 0;
      }


    public int getSaldo(){
      return saldo;
    }


    public List<AccountTransaction> getTransactions(){
      return new ArrayList<AccountTransaction>(accountTransactions);
    }


    public boolean deposit(int belopp)  {
      saldo += belopp;
      addTransaction(AccountTransaction.TransactionType.Deposit, belopp);
      return true;
    }

    public boolean withdraw(int belopp)  {
      if(belopp > saldo) return false;
      saldo -= belopp;
      addTransaction(AccountTransaction.TransactionType.Withdrawal, belopp);
      return true;
    }

    private void addTransaction(AccountTransaction.TransactionType type, int belopp) {
      var transaction = new AccountTransaction(type, belopp);
      accountTransactions.add(transaction);
    }
}
