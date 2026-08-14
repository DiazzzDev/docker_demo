package diazzzdev.demo_docker.greetings.controller;

import diazzzdev.demo_docker.greetings.service.helloService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/greetings")
@RequiredArgsConstructor
public class helloController {
    private final helloService helloService;

    @GetMapping
    public String sayHello() {
        log.info("User requested his greetings");
        return helloService.sayHello();
    }
}
