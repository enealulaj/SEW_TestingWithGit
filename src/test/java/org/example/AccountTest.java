package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account;
    private Account anotherAccount;

    @BeforeEach
    void setUp() {
        account = new Account(1000);
        anotherAccount = new Account(500);
    }

    @Test
    void deposit() {
        account.deposit(200);
        assertEquals(1200, account.checkBalance());
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-50));
    }

    @Test
    void withdraw() {
        try {
            account.withdraw(300);
            assertEquals(700, account.checkBalance());
        } catch (InsufficientFundsException e) {
            fail("Unexpected exception: " + e.getMessage());
        }

        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-100));
        assertThrows(InsufficientFundsException.class, () -> account.withdraw(2000));
    }

    @Test
    void checkBalance() {
        assertEquals(1000, account.checkBalance());
    }

    @Test
    void transfer() {
        try {
            account.transfer(400, anotherAccount);
            assertEquals(600, account.checkBalance());
            assertEquals(900, anotherAccount.checkBalance());
        } catch (InsufficientFundsException e) {
            fail("Unexpected exception: " + e.getMessage());
        }

        assertThrows(IllegalArgumentException.class, () -> account.transfer(100, null));
        assertThrows(InsufficientFundsException.class, () -> account.transfer(2000, anotherAccount));
    }
}
