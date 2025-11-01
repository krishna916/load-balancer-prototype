package me.krishnamurti.lb_backend.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import me.krishnamurti.lb_backend.util.Constants;

@RestController(Constants.LB_API_CONTROLLER)
public class ApiController {

    @GetMapping("/hello")
    public ResponseEntity<String> getHelloWorld() {
        return ResponseEntity.ok("Hello World");
    }
}
