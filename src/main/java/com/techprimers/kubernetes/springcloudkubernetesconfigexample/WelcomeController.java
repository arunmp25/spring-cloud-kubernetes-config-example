package com.techprimers.kubernetes.springcloudkubernetesconfigexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Value("${message: Default Welcome to Youtube}")
    private String message;

    @Value("${another.secretMessage: if this message comes another secret didnt work}")
    private String anotherSecretMessage;

    @Value("${secretMessage}")
    private String secretMessage;

    @GetMapping("/welcome")
    public String welcome() {
        System.out.println(message);
        return message;
    }
    @GetMapping("/secret")
    public String getSecret() {
        System.out.println(secretMessage);
        return secretMessage;
    }

    @GetMapping("/anotherSecret")
    public String getAnotherSecret() {
        System.out.println(anotherSecretMessage);
        return anotherSecretMessage;
    }

}
