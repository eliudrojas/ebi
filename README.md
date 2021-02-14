EBI01705 Senior Java Developer (FIRE)
  
Problem 1  
 
Create a simple RESTful API which provides a service for storing, updating, 
retrieving and deleting Person entities such as those represented in the JSON 
below


{ 
  "person": [ 
    { 
      "first_name": "John", 
      "last_name": "Keynes", 
      "age": "29", 
      "favourite_colour": "red" 
    }, 
    { 
      "first_name": "Sarah", 
      "last_name": "Robinson", 
      "age": "54", 
      "favourite_colour": "blue" 
    } 
  ] 
} 
 
 
You may use an in-memory database as a proof of concept for this test. 
Consider your implementation in light of the following topics, which you may be 
asked about during interview: 


Instruccions

	1.- Oauth server: Spring OAuth2 project to get Token Authentication
	2.- Person-Service: Simple CRUD for testing purpose
		Dockerfile Instruccions
			1.- Edit Dockerfile and change the IP of OAUTH_SERVER_ADDRESS
				OAUTH_SERVER_ADDRESS=IP OF LOCAL MACHINE WHERE IS RUNING
				
				This variable is replaced inside /resources/application.yml inside person-service and is used to communicate with oauth server
				
				
 Inside this Github repo there are many projects, according with the problem I have to consider Security, Scalability,Limitations, Documentation and Deployment
 
 The "Others" project are only included as "DEMO", if you want to configure with person-service and oauth is necessary uncomment some chunck of code and uncomment some lines inside properties file
	
 Only was uploaded as part of "Scalability" solution
 
 
 Documentation
	As part of documentation APIARY solution was used
		URL
			https://app.apiary.io/
			
			USER/PASS to get access are include inside of EMAIL sent it "cremer@ebi.ac.uk"
			
			
			
Dockerfile
Inside of  oaut directory
	docker build -t ebi/oauth-server .

Inside of  person-service directory
	docker build -t ebi/person-service .

ROOT directory
	docker-compose up -d
	
POSTMAN	
	A postman JSON to import is included
	
	
ONLY OAUTH AND PERSONAL-SERVICE PROJECTS ARE NECESSARY FOR THIS TEST
