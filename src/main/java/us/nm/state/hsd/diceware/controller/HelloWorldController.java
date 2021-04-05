package us.nm.state.hsd.diceware.controller;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldController {

  
  @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
  public String greet() {
    return "Hello, world!";
  }
}
