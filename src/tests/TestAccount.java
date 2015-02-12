package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.Account;

public class TestAccount {

    // @Before
    // public void setUp() throws Exception {
    // }
    //
    // @After
    // public void tearDown() throws Exception {
    // }

    /**
     * Test creating a new account.
     */
    @Test
    public void test_create_account() {
        Account myAccount = new Account();
        assertNotNull(myAccount);
        assertEquals(0.0, myAccount.getBalance(), 0.0);
    }

    /**
     * Test_deposit.
     */
    @Test
    public void test_deposit() {
        Account myAccount = new Account();
        assertEquals(0.0, myAccount.getBalance(), 0.0);

        myAccount.setBalance(100);
        assertEquals(100.0, myAccount.getBalance(), 0.0);
        // TODO: change setBalance to a private method and create a deposit
        // method which will handle the calculations
    }
}
