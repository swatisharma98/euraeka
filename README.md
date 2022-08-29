# eureka
Eureka naming server is an application that holds information about all client service applications.Each microservice registers itself with the Eureka naming server.Each microservice registers itself with the Eureka naming server.
 
# Service Registry
 The Eureka naming server comes into existence when we want to make maintenance easier. All the instances of all microservices will be register with the Eureka naming server. Whenever a new instance of a microservice comes up, it would register itself with the Eureka naming server. The registration of microservice with the naming server is called Service Registration.
# Service Discovery
 Whenever a service wants to talk with another service, suppose CalculationService wants to talk to the ItemPriceService. The CalculationService first talk with the Eureka naming server. The naming server provides the instances of ItemPriceService that are currently running. The process of providing instances to other services is called Service Discovery.

# Ribbon

Ribbon is a client-side load balancer that gives you a lot of control over the behavior of HTTP and TCP clients. Feign already uses Ribbon.

If the Ribbon wants to distribute the load to the new server, we need to add it to the configuration. Based on the load, we can increase or decrease the number of instances of the services.

But with Eureka we will be able to increase or decrease the number of instances dynamically.

# Note
Spring Cloud Netflix Ribbon has been deprecated and is not included in the 2020.0.0 release train. Spring Cloud LoadBalancer is the suggested alternative. 
