package ${package}.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/hello-world")
public class HelloWorldController {

    private Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @GetMapping
    public ResponseEntity<String> helloWorld() {
        logger.debug("Hit /api/hello-world endpoint");
        String response = "Hello World!";
        return new ResponseEntity<>(response, OK);
    }

}
