# 12factor
[Twelve-Factor Methodology]( https://www.baeldung.com/spring-boot-12-factor) in a Spring Boot Microservice 

1. Liquibase
If the application uses Hibernate – we're going to take a look at a very useful way of generating the changeLog.
https://github.com/liquibase/liquibase-hibernate/wiki 


B. Via Swagger
http://localhost:8888/swagger-ui.html



DONE
-----
- Spring Boot project creation
- lombok
- JSON
- REST API
- Swagger, Postman, IntelliJ http client, Spring REST clients
- JPA/JPS Data Integration
- Banner https://code-adda.com/2019/01/custom-banners-in-spring-boot/ 
         https://devops.datenkollektiv.de/banner.txt/index.html
- logback  https://www.mkyong.com/logging/logback-xml-example/

TODO BE
-----
-Thymeleaf
-PDF
-Mail services
-Properties with Spring and Spring Boot - https://www.baeldung.com/properties-with-spring 
 
TODO FE
-----
Angular/TS client 
Node.js 
Mongo DB 


To test API either use Browser-Swagger, Postman REST client, IntelliJ http-client,  or JUnit  
-----------------

A. Test on browser

http://localhost:8888/hello/getBook

B. Via Swagger

http://localhost:8888/swagger-ui.html

C. Postman

Install Postman client. 
POST method, http://localhost:8888/api/rate
Set headers: 
Content-Type = application/json
Accept = application/json

BODY
{
  "amount": 3,
  "product": "Nike"
}


D. IntelliJ Scratches

See docs/ directory 


E. JUnit tests - https://www.baeldung.com/rest-template

run: RestTemplateClient
