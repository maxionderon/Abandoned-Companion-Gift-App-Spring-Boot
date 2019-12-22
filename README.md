# Companion-Gift-App-Spring-Boot

---

### Table of Content

* [1. Purpose of this project](#1.)
* [2. What I used](#2.)
    * [2.1. Spring Boot](#2.1.)
    * [2.2. MySQL or H2 as Database](#2.2.)
    * [2.3. Google reCaptcha](#2.3.)
* [3. Changelog](#3.)
* [4. How to install the application](#4.)
    * [4.1. Set up the Database](#4.1.)
        * [4.1.1. Use MySQL](#4.1.1.)
        * [4.1.2. Use H2](#4.1.2.)
---

<a name="1."></a>
## 1. Purpose of this project

API for my companion app. It is possible to CRUD companions, affiliations, gift types and gift reactions. MySQL or H2 usage as DBMS are implemented. 

The API [demo](https://maxionderon.dev/Companion-Gift-App-Admin-Angular/) is hosted via Heroku. Angular application code can be found [here](https://github.com/maxionderon/Companion-Gift-App-Admin-Angular).

<a name="2."></a>
## 2. What I used

<a name="2.1."></a>
### 2.1. Spring Boot

The [Spring Boot](https://spring.io/projects/spring-framewo) framework was used to develop the application.

<a name="2.2."></a>
### 2.2. MySQL or H2 as Database

The application can connect to a [MySQL](https://www.mysql.com/de/) or [H2](https://www.h2database.com/html/main.html) database.

<a name="2.3."></a>
### 2.3. Google reCaptcha

[Google reCAPTCHA](https://www.google.com/recaptcha/intro/v3.html) is used to secure the REST endpoints from abusive behavior.

<a name="3."></a>
## 3. Changelog

* version 0.1

<a name="4."></a>
## 4. How to install the application

* run: ```git clone https://github.com/maxionderon/Companion-Gift-App-Spring-Boot.git```

* run: ```cd Companion-Gift-App-Spring-Boot/```

* create a secret key on [Google reCAPTCHA](https://www.google.com/recaptcha/intro/v3.html)

* provide the secret key in the application.properties file or provide it via system variable with the name `RECAPTCHA_SECRET` 

``` js
...

google.recaptcha.secret=${RECAPTCHA_SECRET:HERE_GOES_YOUR_SECRET_KEY}

...
```
* set up the databse see [4.1.](#4.1.)

* create a database in MySQL (e.g. ```companion-gift-app```) and provide them in the application.properties

* run: ```mvn clean package spring-boot:run``` to start the application. The API is now reachable via the base URL: ```localhost:8080``` which can be used in the [Angular application code](https://github.com/maxionderon/Companion-Gift-App-Admin-Angular).

<a name="4.1."></a>
### 4.1. Set up the Database 

* you can choose between MySQL or H2

<a name="4.1.1."></a>
4.1.1. Use MySQL

* create a database in MySQL (e.g. ```companion-gift-app```) and provide them in the application.properties file:

``` js
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/companion-gift-app?serverTimezone=UTC
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

<a name="4.1.2."></a>
4.1.2. Use H2

* provide following configuration in the application.properties file:

``` js
spring.datasource.url=jdbc:h2:mem:testdb;MODE=MySQL
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```


