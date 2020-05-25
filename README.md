-Read a .csv file of names, social security numbers, account type, and initial deposit
-Use a proper data structure to hold all these accounts
-Both savings and checking accounts share the following properties:
    - deposit()
    - withdraw()
    - transfer()
    - showInfo()

    11 - Digit Account number(generated with the following process: 1 or 2 depending on Savings or Checking, last two digits of SSN, unique 5-digit number, and random 3 digit number)

-Savings account holders are given a safety deposit box, identified by a 3 digit number and accessed with a 4 digit code.
-Checking accounts holders are assigned a debit card witha  12 digit number and 4 digit pin
-Both accounts will use an interface that determines the base interest rate.
    -savings accounts will use .25 points less than the base rate
    - checking accounts will use 15% of the base rate
-The showInfo method should reveal relevant account information as well as information specific to the checking account or savings account

Learning Objectives:

-Learn to develop a robust application architecture
-Use when to use abstract classes and abstract methods
-Use an interface API to receive information from a developer's application
-Explore constructors deeper and use the super() keyword
-Explore access modifiers and when to use public, private, or protected
-REad data from a file and store in an appropriate data structure
-Generate random numbers and work with STring API
