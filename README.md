# Companion-Gift-App-Spring-Boot

---

### Table of Content

* [1. Purpose of this project](#1.)
* [2. What I used](#2.)
    * [2.1. Spring Boot](#2.1.)
    * [2.2. MySql or H2 as Database](#2.2.)
    * [2.3. Google reCaptcha](#2.3.)
* [3. Changelog](#3.)
* [4. How to install the application](#5.)

---

<a name="1."></a>
## 1. Purpose of this project

API for my companion app. It is possible to CRUD companions, affiliations, gift types and gift reactions. MySql or H2 usage as DBMS are implemented. 

The API [demo](https://maxionderon.dev/Companion-Gift-App-Admin-Angular/) is hosted via Heroku. Angular application code can be found [here](https://github.com/maxionderon/Companion-Gift-App-Admin-Angular).

<a name="2."></a>
## 2. What I used

<a name="2.1."></a>
### 2.1. Spring Boot

The [Spring Boot](https://spring.io/projects/spring-framewo) framework was used to develop the application.

<a name="2.2."></a>
### 2.2. [MySql](https://www.mysql.com/de/) or [H2](https://www.h2database.com/html/main.html) as satabase

The application can connect to a MySql or H2 database.

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

* run: ```mvn clean package spring-boot:run``` to start the application. The API is now reachable via the base URL: ```localhost:8080``` which can be used in the [Angular application code](https://github.com/maxionderon/Companion-Gift-App-Admin-Angular).

