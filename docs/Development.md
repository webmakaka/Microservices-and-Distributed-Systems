# [Nelson] Microservices and Distributed Systems [ENG, 2022]


<br/>

## 02. Bootstrap With Maven

https://maven.apache.org/guides/getting-started/index.html

<br/>

```
$ cd apps
$ mvn archetype:generate -DgroupId=org.javadev -DartifactId=amigosservices -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

<br/>

We removed generated source codes except pom.xml


<br/>

## 03. Your First Microservice

```
$ docker-compose up
```

<br/>

**create db customer manually**

<br/>

```
// CREATE CUSTOMER
// POST
$ curl \
    --data '{
      "firstName":"Jamila",
      "lastName":"Ahmed",
      "email":"jahmed@gmail.com"
      }' \
    --header "Content-Type: application/json" \
    --request POST \
    --url http://localhost:8080/api/v1/customers \
    | jq
```


<br/>

![Application](/img/pic-m03-p01.png?raw=true)


<br/>

## 04. Microservice Communication via HTTP

<br/>

**create fraud database manually**

<br/>

```
// CREATE CUSTOMER
```

<br/>

```
SELECT * FROM fraud_check_history;
```

<br/>

![Application](/img/pic-m04-p01.png?raw=true)


<br/>

## 05. Service Discovery with Eureka


<br/>


https://spring.io/projects/spring-cloud


<br/>

http://localhost:8761/

<br/>

![Application](/img/pic-m05-p01.png?raw=true)


<br/>

## 06. Open Feign

https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/


<br/>

```
// CREATE CUSTOMER
```

<br/><br/>

---

<br/>

**Marley**

Any questions in english: <a href="https://javadev.org/chat/">Telegram Chat</a>  
Любые вопросы на русском: <a href="https://javadev.ru/chat/">Телеграм чат</a>