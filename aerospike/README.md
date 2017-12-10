# Springboot Aerospike

This application is simple integration of Spring Boot App to locally running Aerospike DB

## Rest Resource

**GET** http://localhost:8080/rest/users

**POST**  http://localhost:8080/rest/users
{
	"id": 124,
	"name": "Ali",
	"salary": 1234
}

## Docker Commands

**Run Aerospike Server** docker run -d --name aerospike -p 3000:3000 aerospike/aerospike-server  
**Run Management Console** docker run -d -p 8081:8081 mrbar42/aerospike-amc

# Referece

[Spring Boot with Aerospike Example | Spring Data Aerospike | Tech Primers](https://www.youtube.com/watch?v=MUmHNgzN-IU)
