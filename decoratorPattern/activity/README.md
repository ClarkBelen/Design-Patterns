# Digital Banking System
CIMB is a digital bank that offers GSave and UpSave savings accounts. As with a typical Savings Account, it contains the account number, account name, and a balance for that account.

The typical savings account offers an interest rate of 1%.
The benefits of the typical savings account are the same as the "Standard Savings Account" compared to other banks.

The GSave account offers an interest rate of 2.5%.
Benefits include the "Standard Savings Account" plus access to "GCash transfer".

The UpSave account offers the highest interest rate of 4.0%.
Benefits include the "Standard Savings Account" plus "with Insurance".


#### **Classes or Key elements include:**
**1. Component Interface: BankAccount interface**
- The Component Interface defines the methods that all Concrete Components and Decorators must implement. In this program, the BankAccount interface defines the different methods, which all types account must implement.

**2. Concrete Component: SavingsAccount class**
- A Concrete Component is the basic implementation of the Component Interface. In this program, the SavingsAccount class is the Concrete Component, which implements the BankAccount interface and provides a basic implementation of the all methods from this interface.

**3. Decorator Interface: BankAccountDecorator interface**
- The Decorator Interface extends the Component Interface and defines additional methods that all Concrete Decorators must implement. In this program, the BankAccountDecorator interface extends the BankAccount interface and adds the setBankAccount() method.

**4. Concrete Decorators: GSave and UpSave classes**
- A Concrete Decorator is a class that implements the Decorator Interface and adds functionality to the Component it decorates. In this program, the GSave and UpSave classes are Concrete Decorators that add functionality to the SavingsAccount Component. They both implement the BankAccountDecorator interface and add the setBankAccount() method to set the Component they will decorate. They also override all methods of the Component Interface to add their specific functionality (e.g. Account type, Interest rate, and Benefits).



## UML Diagram
![Decorator Pattern (1)](https://github.com/ClarkBelen/decoratorPattern/assets/142368338/2b44ce1d-99fb-4a79-9e8e-291f1ccb93e2)