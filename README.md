


# Payment wallet Application
It is built to support all the functionality related to managing a online payment wallet application for XYZ bank. We will discuss each aspect of this project in detail for enhanced understanding. The Payment wallet Application project is designed in Spring Boot and Hibernate along with the source code. Customers will be able to park their money in the wallet , pay different bills using this wallet and customers should be able to connect bank account with this payment wallet and add money.  On the other hand, Application should allow customers to check the balance, deposit money etc.



Payment wallet Application ER diagram

Er-diagram

Tech Stack

- Java
- Spring Framework
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- lombok

Modules

- Account Module
- Customer Module
- Bill Payment Module
- Transaction Module
- Beneficiary Module
- Bank Account Module

Functions of Account, Customer, Beneficiary..

Through Account service we can :

- Add new Account into the system.
- Remove a particular Account into the system.
- View a particular Account details into the system.
- View all Account details into the system.


Through Customer we can:

- Can Log in/Log out of the system.

Through Beneficiary we can:


- Add new Beneficiary into the system.
- Remove a particular Beneficiary into the system.
- View a particular Beneficiary details into the system.
- View all Beneficiary details into the system.

Contributors

- @Roshni
- @Abhishek Kumar
- @Abhishek Kumar
- @Bubai Ghosh
- @Navneet Singh

## Installation & Run

- To run this API server, you should update the database configuration inside the application.properties file which is present in the src/main/resources folder.
- Update the port number, username and password as per your local database configuration.
- server.port=8088
spring.datasource.url=jdbc:mysql://localhost:3306/FoodExpress;
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=your_username_here
spring.datasource.password=your_password_here
```
## API Root Endpoint
```
https://localhost:8088/
```
```
https://localhost:8088/swagger-ui.html
```
