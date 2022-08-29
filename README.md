# eureka
Eureka naming server is an application that holds information about all client service applications.Each microservice registers itself with the Eureka naming server.Each microservice registers itself with the Eureka naming server.
 
# Service Registry
 The Eureka naming server comes into existence when we want to make maintenance easier. All the instances of all microservices will be register with the Eureka naming server. Whenever a new instance of a microservice comes up, it would register itself with the Eureka naming server. The registration of microservice with the naming server is called Service Registration.
# Service Discovery
 Whenever a service wants to talk with another service, suppose CalculationService wants to talk to the ItemPriceService. The CalculationService first talk with the Eureka naming server. The naming server provides the instances of ItemPriceService that are currently running. The process of providing instances to other services is called Service Discovery.

