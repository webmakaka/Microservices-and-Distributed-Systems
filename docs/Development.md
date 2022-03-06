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

**create "customer" database manually**

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

**create "fraud" database manually**

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

<br/>

## 07. Exercise

<br/>

**create "notification" database manually**

<br/>

![Application](/img/pic-m06-p01.png?raw=true)

<br/>

## 08. Distributed Tracing

https://spring.io/projects/spring-cloud-sleuth

https://zipkin.io/

<br/>

```
$ docker-compose up -d
$ docker logs zipkin
```

<br/>

```
// CREATE CUSTOMER
```

<br/>

http://127.0.0.1:9411/zipkin/


<br/>

![Application](/img/pic-m08-p01.png?raw=true)

<br/>

![Application](/img/pic-m08-p02.png?raw=true)

<br/>

## 09. Api Gateway With Spring Cloud Gateway

https://spring.io/projects/spring-cloud-gateway


<br/>

![Application](/img/pic-m09-p01.png?raw=true)

<br/>

## 10. Message Queues


<br/>

## 11. RabbitMQ

```
$ docker-compose up -d
```

<br/>

http://localhost:15672/

<br/>

guest/guest


<br/>

```
// GW CREATE CUSTOMER
// POST
$ curl \
    --data '{
      "firstName":"Jamila",
      "lastName":"Ahmed",
      "email":"jahmed@gmail.com"
      }' \
    --header "Content-Type: application/json" \
    --request POST \
    --url http://localhost:8083/api/v1/customers \
    | jq
```

<br/>

![Application](/img/pic-m11-p01.png?raw=true)

<br/>

## 12. Packaging Microservices to Runnable Jar

<br/>

```
$ mvn clean
$ mvn package
$ mvn install
```

<br/>

```
$ java -jar eureka-server/target/eureka-server-1.0-SNAPSHOT.jar
$ java -jar customer/target/customer-1.0-SNAPSHOT.jar
****
```


<br/>

## 13. Packaging Jars to Docker Images

https://github.com/GoogleContainerTools/jib

https://hub.docker.com/_/eclipse-temurin/


<br/>

```
$ docker logout
$ docker login
```

<br/>

```
$ mvn clean package -P build-docker-image
```

<br/>

```
[INFO] 
[INFO] amigosservices ..................................... SUCCESS [  0.075 s]
[INFO] amqp ............................................... SUCCESS [  1.824 s]
[INFO] clients ............................................ SUCCESS [  0.441 s]
[INFO] customer ........................................... SUCCESS [ 10.978 s]
[INFO] fraud .............................................. SUCCESS [  9.214 s]
[INFO] eureka-server ...................................... SUCCESS [  8.539 s]
[INFO] notification ....................................... SUCCESS [  9.656 s]
[INFO] apigw .............................................. SUCCESS [  8.667 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  49.666 s
[INFO] Finished at: 2022-03-06T20:01:10+03:00
[INFO] ------------------------------------------------------------------------
```

<br/>

```
$ docker-compose pull
$ docker-compose up -d
```

<br/>

```
$ docker logs apigw
```

<br/>

```
$ docker-compose ps
```

<br/>

http://localhost:8761/


<br/>


![Application](/img/pic-m13-p01.png?raw=true)


<br/>


```
// GW CREATE CUSTOMER
```

<br/>


![Application](/img/pic-m13-p02.png?raw=true)



<br/>

```
$ docker-compose stop
```

<br/><br/>

---

<br/>

**Marley**

Any questions in english: <a href="https://javadev.org/chat/">Telegram Chat</a>  
Любые вопросы на русском: <a href="https://javadev.ru/chat/">Телеграм чат</a>