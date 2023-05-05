


# Payment wallet Application
It is built to support all the functionality related to managing a online payment wallet application for XYZ bank. We will discuss each aspect of this project in detail for enhanced understanding. The Payment wallet Application project is designed in Spring Boot and Hibernate along with the source code. Customers will be able to park their money in the wallet , pay different bills using this wallet and customers should be able to connect bank account with this payment wallet and add money.  On the other hand, Application should allow customers to check the balance, deposit money etc.



![Slide 1 (1)](https://user-images.githubusercontent.com/103949784/226496104-41075c45-df07-45d0-aa16-311fdc6fbf69.jpeg)


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

1) Abhishek Kumar -Team Lead, Responsible for creating and implementing the Customer module and flow of the project.

2) Bubai Ghosh -Responsible for creating the Repository while making sure of proper implementation Of Controllers.

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


<li>Login Logout User authentication, and their methods 

![Slide 11](https://user-images.githubusercontent.com/103949784/226496359-65824ed8-bdbf-4b02-ab23-0c3420f568ac.jpeg)

<li>Account Module, and their methods 

![Slide 8](https://user-images.githubusercontent.com/103949784/226497357-eccc57a5-5832-4464-a5d0-bad1e2b0b120.jpeg)

<li>Customer Module, and their methods 

![Slide 9](https://user-images.githubusercontent.com/103949784/226497869-dfb4c2f6-d1ca-46d3-89cc-57157a176ba9.jpeg)


<li>BankAccount Module, and their methods

![Slide 5](https://user-images.githubusercontent.com/103949784/226497546-6e74beac-68d9-4895-b990-6744ef1bb08e.jpeg)


<li>Beneficiary Details Module, and their methods

![Slide 7](https://user-images.githubusercontent.com/103949784/226497603-19882dc9-c0cf-4292-bed2-769fd4fc918b.jpeg)

<li>BillPayment Module, and their methods

![Slide 10](https://user-images.githubusercontent.com/103949784/226497675-3cb37b9d-19e8-4d27-8856-a72c35954fe6.jpeg)

<li>Transaction Module, and their methods

![Slide 6](https://user-images.githubusercontent.com/103949784/226497727-e7957234-b9b0-4b58-a1b6-0e4fe5f09d2f.jpeg)

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


