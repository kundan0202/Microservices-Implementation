# Microservices-Implementation
Stock API Mini Project implementation with Microservice-Load balancing, API Gateway,client,server

we develop  REST API which takes company name as i/p and give its stock price,based on stock details stored in temporary DB

![image](https://user-images.githubusercontent.com/60955560/132849602-5b3ee2a8-5b79-4efe-917b-5316df3184c3.png)

STOCK-CALC-API & STOCK-PRICE-API interact with each other using Feign client as they are in-house api
STOCK-CALC-API(client) & STOCK-PRICE-API(Resource)  acts as a client for Eureka.
Api Gateway also going to acts as a client for Eureka.

