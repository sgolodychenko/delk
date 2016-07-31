//mvn clean package
start call java -jar target/microservice-demo-1.1.0.RELEASE.jar registration
start call java -jar target/microservice-demo-1.1.0.RELEASE.jar accounts
@echo "Waiting while services will start.."
timeout /t 30
start call java -jar target/microservice-demo-1.1.0.RELEASE.jar web
