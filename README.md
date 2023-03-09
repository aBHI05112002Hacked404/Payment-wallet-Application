


# Payment wallet Application
It is built to support all the functionality related to managing a online payment wallet application for XYZ bank. We will discuss each aspect of this project in detail for enhanced understanding. The Payment wallet Application project is designed in Spring Boot and Hibernate along with the source code. Customers will be able to park their money in the wallet , pay different bills using this wallet and customers should be able to connect bank account with this payment wallet and add money.  On the other hand, Application should allow customers to check the balance, deposit money etc.


<br>
  
# ER Diagram
<hr>
The following Diagram depicts the flow of our Entity Relation Diagram to simplify the work flow.
<br>
<br>
  
  
![WhatsApp Image 2022-09-27 at 9 52 51 PM](https://user-images.githubusercontent.com/57911117/192693251-f4deedb6-d884-404c-9529-3970e25a8a5f.jpeg)

<br>
<br>
<hr>
  
# Team Member Roles And Responsibilities
  
<hr>
<br>
<br>

1) Bubai Ghosh  -Team Lead, Responsible for creating and implementing the ER diagram and flow of the project.

2) Abhishek Kumar -Responsible for creating the Repository while making sure of proper implementation Of Controllers

3) Abhishek Kumar -Responsible For handeling the Exceptions and Creating the Service Layer.

4) Navneet Singh -Responsible for The frontent Layer while implementing proper RESTful API naming Conventions.

5) Roshni -Responsible for Creating the login and logout Session layer with proper validation.

<br>
<br>

# Teach Stacks Implemented
<hr>
<br>
<br>
<li>Java
<li>Spring framework
<li>Spring Boot JPA
<li>Hibernate
<li>MySQL
<li>Swagger
<li>Lombok

  

<br>
<br>



# Modules
<hr>
<li>Login Logout User authentication
<li>Wallet
<li>BankAccount
<li>BeneficiaryDetails
<li>BillPayment
<li>Transaction

<br>
<br>

# Features
<hr>
<br>

- User Login authrntication
- validation for the account number
- validation for the current user and user identification
- RESTful API with CURD operations
- Functional Front End For better user experience

<br>
<br>

# Installation & Run
<hr>
<br>
<br>

```
#changing the server port
server.port=8888
#db specific properties
spring.datasource.url=jdbc:mysql://localhost:3306/sb201db
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=root
#ORM s/w specific properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER
```

<br>
<br>

# API Root Endpoint
<hr>
<br>
<br>

```
https://localhost:8888/
```

```
https://localhost:8888/swagger-ui/#
```
<br>
<br>


# Screenshots

![Swagger UI - Google Chrome 03-10-2022 09_20_51](https://user-images.githubusercontent.com/101331023/193498809-acec52c3-bf24-498a-8478-1b48c69228ea.png)



![Swagger UI - Google Chrome 03-10-2022 09_21_13](https://user-images.githubusercontent.com/101331023/193498829-1cdd1d29-720c-413b-a61b-e376b2d8071f.png)




![Swagger UI - Google Chrome 03-10-2022 09_21_26](https://user-images.githubusercontent.com/101331023/193498841-22886520-b223-4edc-88cb-224b05233aa7.png)



Contributors

- @Roshni
- @Abhishek Kumar
- @Abhishek Kumar
- @Bubai Ghosh
- @Navneet Singh


