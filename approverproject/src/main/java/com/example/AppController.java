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
	  
<<<<<<< HEAD
	  @GetMapping("/student")
	  public String getstudent() {
		  return "Student";
=======
	  @GetMapping("/user")
	  public String getUserData() {
		  return "user";
>>>>>>> f7f88b4ef4a2f3acfa27c1f905d8623d1add202b
	  }
}
