# microservices_observability_monitoring
A mini project with SpringBoot based microservices with basic functionalities to support observability and monitoring using Jaeger, Prometheus, Grafana

 ReadMe - Create Order Application:
 ==================================

1. this is a simple create order application build using 3 SpringBoot microservices  - order, catalogue and payment respectively.
2. These 3 microservices have very bases 3 GET nd points to getOrder, getCatalogue, make payment operations. The basic functionality being if a order is received with some predfined 
    catalogue names, then order will be proceeded for payment wit response as "online" 
3. If in case the catalogue name is not present or an invalid "numeric" order name is provided as invalid input - then exception will be raised with 204 as resource not found
4. Assumption is that 
5. Observability principles - Distributed Tracing, HealthcheckAPI, Application metrics, Exception tracking, Audir Logging. This project - Create order focuses on mainly three 
   principles - Distributed Tracing, HealthcheckAPI, Application metrics.
6. The application uses Jaeger for distributed tracing, Micrometer alongwith Prometheus for Application metrics.
7. The application uses Prometheus dashboard to display application metrics.
8. Grafana (to display better visualization of graphs for system/app metrics) with Prometheus as data source is also used here to display application metrics.
9. Attached is the High-level diagram for the observability and monitoring for this application.
 
 
 Deployment
 =========
 
 1. The three SpringBoot microservices are deployed in localhost as Embedded tomcat part of SpringBoot.
 2. Jaeger, Prometheus, Grafana are deployed as docker containers.
 
 
 Assumptions:
 =============
 1. the features are build with some random basic requirements, the idea is to showcase and focus on observablity principles of microservices
 2. The source code doesnt consist of .JAR files, each microservice can be build seperately using : 'mvn clean install' command at place where pom.xml is present  for each microservices. 
 3. Each microservices are configured using - 8000 (order), 8002(catalog), 8003(payment) tomcat server ports.
 
 
 URLs:
 ====
 3. The local end-points  - 
	a) Postman end-points for calling Create Order service which calls other business calls - Catalogue and Payment
    a) http://localhost:16686/ - URL to view Jaeger distributed tracing
	b) http://localhost:9090/ - URL to view Prometheus dashboard for application/system metrics
	c) http://localhost:3000/d/RnsbxnXMz/create-order-monitoring-dashboard?orgId=1 -- URL to view Grafana dashboard for application/system metrics graphs


