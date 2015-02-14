Notes on progress
=================

* created empty project
* added tests package
* created classes package
* created empty account class in the classes package
* created empty test class in the tests package

* created basic test case for create account
* this passed because there is no specific checks required to instantiate any normal object
* need to add more specific tests inside the create account (minimum balance etc)
* added a check to see if the initial balance of the account is $0.00
    * it was not and the getBalance method did not exist
* created the getBalance method to return 0.0 to get the test to pass
* this was obviously not how the class is meant to work, so I created a local variable in Account to hold the balance
* changed the constructor to set the balance to 0.0

* added a test to see what happens when trying to deposit money into the account
* there was no deposit or setBalance method, so the test failed
* created a method which sets the balance to whatever is passed in
* this does not do what we need, it will only set the balance to whatever is passed in, ignoring the deposit mechanism

----> change setBalance to a private method and create a deposit method which will handle the calculations

* got rid of setBalance and created a deposit method which adds the input value to the current account balance
* the tests now pass

* it is now time to work on the withdraw method
* created a test for withdrawing 80, expecting the balance to be 20.
* it failed to load because no withdraw method exists, so I created it...
* test still fails because withdraw() is empty
* added calculation to withdraw()
* test passes

* added test for if trying to withdraw more than is available
* this failed because no logic in withdraw to check for this and charge accordingly
* added logic
* test passes

* at this point all basic logic required was built
* went through and added invalid argument test cases
* built illegal argument checking into the methods
* extracted out code that was used in multiple places that might want to be adjusted or used elswhere as the account requirements change over time

* did final code cleaning
