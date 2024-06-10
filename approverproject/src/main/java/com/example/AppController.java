package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	  @GetMapping("/hello")
      public String hello() {
    	  return "Hello";
      }
	  
	  @GetMapping("/welcome")
	  public String welcome() {
		  return "Welcome";
	  }
	  
	  @GetMapping("/student")
	  public String getstudent() {
		  return "Student";
	  }
}
