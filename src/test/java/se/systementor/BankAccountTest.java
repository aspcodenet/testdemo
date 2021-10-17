package se.systementor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    void withDrawLargerAmountThanFundsShouldReturnFalse(){
        var sut = new BankAccount("132312", "2222");
        
        var result = sut.withdraw(100);
        assertFalse(result);
    }

    @Test
    void withDrawAmountShouldReturnTrue(){
        var sut = new BankAccount("132312", "2222");
        sut.deposit(100);
        var result = sut.withdraw(100);
        assert(result);
    }

    @Test
    void withDrawAmountShouldDecreaseSaldo(){
        var sut = new BankAccount("132312", "2222");
        sut.deposit(100);
        sut.withdraw(30);
        assertEquals(70, sut.getSaldo());
    }

}
