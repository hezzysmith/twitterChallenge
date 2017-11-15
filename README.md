# twitterChallenge
Salesforce Twitter Challenge

# To start the Backend server
```
cd server
export JAVA_HOME=$(/usr/libexec/java_home -v 1.8)
./mvnw spring-boot:run -e
```

# To start the Frontend application
```
cd client

/* install http-server  (https://github.com/indexzero/http-server) */ 
http-server

open http://localhost:8081/
```

![alt text](https://github.com/hezzysmith/twitterChallenge/blob/master/screen.png?raw=true)
