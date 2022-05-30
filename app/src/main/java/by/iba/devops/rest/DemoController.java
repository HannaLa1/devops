package by.iba.devops.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/service")
public class DemoController {

    @GetMapping("/health")
    public ResponseEntity<String> getHealth() {
        return new ResponseEntity<>("Healthy!", HttpStatus.OK);
    }


    @GetMapping("/test-get")
    public ResponseEntity<String> getMessage() {
        return new ResponseEntity<>("Welcome to application from aws!", HttpStatus.OK);
    }
}
