# JUnit-Test-Creditcard
# Task
<br/>
favorite testing framework (xUnit, JUnit, NUnit, etc.).

Visa gets 10% MC gets 5% interest Discover gets 1% interest Each Card Type can have multiple cards and there can be multiple Wallets for a Person. NOTE: SIMPLE INTEREST for this test case (means 1 month of interest, if the interest rate is 10% and the amount is 100.00 – interest in this case would be 10.00)

Here are the test Cases -

1 person has 1 wallet and 3 cards (1 Visa, 1 MC 1 Discover) – Each Card has a balance of $100 – calculate the total interest (simple interest) for this person and per card.

1 person has 2 wallets Wallet 1 has a Visa and Discover , wallet 2 a MC - each card has $100 balance - calculate the total interest(simple interest) for this person and interest per wallet

2 people have 1 wallet each, person 1 has 1 wallet , with 2 cards MC and visa person 2 has 1 wallet – 1 visa and 1 MC - each card has $100 balance - calculate the total interest(simple interest) for each person and interest per wallet Discuss your solution on the basis of SOLID programming principles-

                                  Problem analysis, testing and solution
Review of the program requirements

Resolve any questions about requirements

• Design -- UML (Universal Modeling Language)

Grouping of the classes

--List all related "nouns/objects" relative to the requirements Credit card (supper class) MC/Visa/Discover (subclasses because they all derive from the credit card class). -- Wallet( You can add or remove cards from the wallet) -- Person ( People can own more than one or more wallets/cards)

-- Grouping of Methods -- list "verbs/actions" of the objects -- add credit to a wallet -- create a card -- take out credit card -- calculate interest for month -- calculate balance

• Implementation -- adhere to "standard coding practices" -- headers on all classes --comments --adhere to naming conventions (class names:Starts w/uppercase; vars:starts w/lowercase, etc...) --self-documenting code (JavaDoc) -- correct indentations --no hard numbers -- use constants

• JUnit -- unit tests is performed for each class to ensure there are no coding errors. The Junit test uses the assert() method to check an expected result versus the actual result for the code or method under test. A Java program that calculates Credit Card interest for a Person and a JUnit test for each Class.
