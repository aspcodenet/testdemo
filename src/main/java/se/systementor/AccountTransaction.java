package se.systementor;

import java.time.Instant;

public class AccountTransaction {

    private TransactionType type;
    private int belopp;
    private Instant ts;


    public enum TransactionType {
        Withdrawal,
        Deposit
      }
    

      public int getBelopp(){
          return belopp;
      }
      public TransactionType getType(){
        return type;
    }
    public Instant getTimestamp(){
        return ts;
    }


    public AccountTransaction(TransactionType type, int belopp) {
        super();
        this.type = type;
        this.belopp = belopp;
        this.ts = Instant.now();
        
    }
}
