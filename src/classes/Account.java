package classes;

/**
 * The Account class. This holds the balance information related to an account.
 * 
 * This type of account is a highly secure account, there are no names or
 * numbers attached to them. Therefore, there is no need for adding name,
 * address or account number fields. The account does not allow for creation or
 * last accessed information either. In short, no one will ever know anything
 * about these accounts except their balance.
 * 
 * @author chrcoe
 */
public class Account {

    /** The balance of the account. */
    private double balance;

    /** The insufficient fund fee. */
    private static double INSUFFICIENT_FUND_FEE = 25.0;

    /**
     * Default Constructor initializes the balance.
     */
    public Account() {
        this.balance = 0.0;
    }

    /**
     * Gets the balance.
     * 
     * @return the balance
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * Deposits money into the account.
     * 
     * @param deposit_amt
     *            the amount to deposit
     * @throws IllegalArgumentException
     *             if the amount is negative
     */
    public void deposit(double deposit_amt) throws IllegalArgumentException {
        validate_amount(deposit_amt);
        this.balance += deposit_amt;
    }

    /**
     * Withdraw money from the account.
     * 
     * @param withdraw_amt
     *            the amount to withdraw
     * @throws IllegalArgumentException
     *             if the amount is negative
     */
    public void withdraw(double withdraw_amt) throws IllegalArgumentException {
        validate_amount(withdraw_amt);
        if (this.balance >= withdraw_amt) {
            this.balance -= withdraw_amt;
        }
        else charge_insufficient_fund_fee();
    }

    /**
     * Charges a bank fee to the account.
     */
    private void charge_insufficient_fund_fee() {
        this.balance -= INSUFFICIENT_FUND_FEE;
    }

    /**
     * Validates that the input parameter is valid.
     * 
     * @param amount
     *            the amount
     * @throws IllegalArgumentException
     *             if the amount is negative
     */
    private void validate_amount(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount was invalid!");
        }
    }
}
