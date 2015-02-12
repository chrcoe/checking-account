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

