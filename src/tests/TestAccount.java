package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import classes.Account;

/**
 * The Class TestAccount.
 */
public class TestAccount {

    /** The test_account. */
    private Account test_account;

    /**
     * Sets up each test case.
     */
    @Before
    public void setUp() {
        this.test_account = new Account();
    }

    /**
     * Test creating a new account.
     */
    @Test
    public void test_create_account() {
        assertNotNull(test_account);
        assertEquals(0.0, test_account.getBalance(), 0.0);
    }

    /**
     * Test depositing money into account.
     */
    @Test
    public void test_deposit() {
        assertEquals(0.0, test_account.getBalance(), 0.0);
        test_account.deposit(100.0);
        assertEquals(100.0, test_account.getBalance(), 0.0);
        test_account.deposit(100.0);
        assertEquals(200.0, test_account.getBalance(), 0.0);
    }

    /**
     * Test depositing negative amount into account.
     */
    @Test(expected = IllegalArgumentException.class)
    public void test_deposit_negative() {
        test_account.deposit(-10);
    }

    /**
     * Test simple withdraw from account.
     */
    @Test
    public void test_withdraw() {
        test_account.deposit(100);
        test_account.withdraw(80.0);
        assertEquals(20.0, test_account.getBalance(), 0.0);
    }

    /**
     * Test withdrawing money from account when it has insufficient funds.
     */
    @Test
    public void test_withdraw_decline() {
        test_account.deposit(20);
        test_account.withdraw(30);
        assertEquals(-5.0, test_account.getBalance(), 0.0);
        test_account.withdraw(10);
        assertEquals(-30.0, test_account.getBalance(), 0.0);
    }

    /**
     * Test withdrawing negative amount from account.
     */
    @Test(expected = IllegalArgumentException.class)
    public void test_withdraw_negative() {
        test_account.withdraw(-10.0);
    }

    /**
     * Test the list of transactions provided in project specs.
     */
    @Test
    public void test_transactions() {
        test_account.deposit(100);
        test_account.withdraw(80.0);
        assertEquals(20.0, test_account.getBalance(), 0.0);
        test_account.withdraw(30);
        assertEquals(-5.0, test_account.getBalance(), 0.0);
        test_account.withdraw(10);
        assertEquals(-30.0, test_account.getBalance(), 0.0);
        test_account.deposit(100);
        assertEquals(70.0, test_account.getBalance(), 0.0);
    }
}
