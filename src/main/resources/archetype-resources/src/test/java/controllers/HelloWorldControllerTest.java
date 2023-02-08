package ${package}.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.http.HttpStatus.OK;

public class HelloWorldControllerTest {

    private HelloWorldController helloWorldController = new HelloWorldController();

    @Test
    public void test() {
        String expected = "Hello World!";

        ResponseEntity<String> response = helloWorldController.helloWorld();

        assertEquals(OK, response.getStatusCode());
        assertEquals(expected, response.getBody());
    }

}
