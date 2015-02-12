package classes;

/**
 * The Class Account.
 * 
 * @author chrcoe
 */
public class Account {

    /** The balance. */
    private double balance;

    /**
     * Default Constructor.
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
     * Sets the balance.
     *
     * @param balance the new balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

}
