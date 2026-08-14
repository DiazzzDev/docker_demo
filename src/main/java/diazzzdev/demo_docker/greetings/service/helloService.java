package diazzzdev.demo_docker.greetings.service;

import org.springframework.stereotype.Service;

@Service
public class helloService {
    public String sayHello() {
        return "Hello World! Greetings from Docker! by Edwin Díaz";
    }
}
