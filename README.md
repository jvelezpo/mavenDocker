# mavenDocker
Hello world on docker and maven
README file


To run it copy and paste this on the terminal
```
docker run -p 8080:8080 -t jvelezpo/myapp java -Djava.security.egd=file:/dev/./urandom -jar target/gs-spring-boot-docker-0.1.0.jar
```

or if you want to go the easy way type this:

```
docker-compose up
```