# springboot-jdbc



curl -i -X POST -H "Content-Type:application/json" -d "{\"title\" : \"Hello World\", \"description\": \"Simple coding examples and tutorials\"}" http://localhost:8080/books  


curl http://localhost:8080/books  


curl curl http://localhost:8080/books/2  


curl -i -X PATCH -H "Content-Type:application/json" -d "{\"title\" : \"Hello World 2 updated\"}" http://localhost:8080/books/2  


curl -i -X PUT -H "Content-Type:application/json" -d "{\"title\" : \"Hello WOrld 2 replaced\"}" http://localhost:8080/books/2

curl -i -X DELETE http://localhost:8080/books/2  





docker run -ti -p 8080:8080 \
	-v /Users/rfoe/workspace/projects/ntuc/config:/deployments/config \
	-e JAVA_ARGS="--spring.config.location=file:/deployments/config/appconfig.properties" \
	redhat/demo/springboot-jdbc:1.0.0 bash


--spring.config.location=file:/deployments/config/appconfig.properties
