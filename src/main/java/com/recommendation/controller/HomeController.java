package com.recommendation.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class HomeController {
    // This method is mapped to the root ("/") URL using the @GetMapping annotation.
    // It will handle GET requests for the home page.
    @GetMapping("/")

    // The @ResponseBody annotation indicates that the return value of this method will
    // be directly written to the HTTP response body. In this case, it will return a String.
    public String home() {
        // The method returns a simple message to confirm that the Spring Boot application is running.
        // This will be shown when the user visits the root URL of the application.
        return "✅ Spring Boot is running and your Recommendation System is ready to build!";

    }
}
