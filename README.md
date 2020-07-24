# JUnit-Test-Creditcard
# Task
Write a program that calculates the Credit Card interest for a Person. Create unit tests for each class using the JUnit 
testing framework.
## Credit Rating
- Visa gets 10% interst
- MC gets 5% interst
- Discover gets 1% interest

Each Card type can have multiple cards and there can be multiple Wallets for a Person. NOTE: SIMPLE INTEREST for this test case (means 1 month of interest, if the interest rate is 10% and the amount is 100.00 – interest in this case would be 10.00)


# Test Cases:
- 1 person has 1 wallet and 3 cards (1 Visa, 1 MC 1 Discover) – Each Card has a balance of $100 – calculate the total interest (simple interest) for this person and per card.
- 1 person has 2 wallets Wallet 1 has a Visa and Discover , wallet 2 a MC - each card has $100 balance - calculate the total interest(simple interest) for this person and    interest per wallet
- 2 people have 1 wallet each, person 1 has 1 wallet , with 2 cards MC and visa person 2 has 1 wallet – 1 visa and 1 MC - each card has $100 balance - calculate the total     interest(simple interest) for each person and interest per wallet. 

# Run Locally
You can clone the repo link and run it with an IDE of your choice.
                           
# Design -- UML (Universal Modeling Language)

### Grouping of the classes
- Credit card (supper class) 
- MC/Visa/Discover (subclasses)  
- Wallet( You can add or remove cards from the wallet) 
- Person (People can own more than one or more wallets/cards)

### Grouping of Methods 
- Add credit to a wallet 
- Create a card 
- Take out credit card
- Calculate interest for month
- Calculate balance

# Implementation 
- Adhere to "standard coding practices"
- Headers and commnets on all classes
- Adhere to naming conventions (class names:Starts w/uppercase; vars:starts w/lowercase, etc...) 
- Self-documenting code (JavaDoc) -- correct indentations --no hard numbers -- use constants

# JUnit Tests
Unit tests are performed for each class to ensure there are no coding errors. The Junit test uses the assert() method to check an expected result versus the actual result for   the code or method under test. Very that all the test cases are passed.
