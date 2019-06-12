package com.idothestamping.lab11.songr.SongrController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongrController {

    // route for this method
    @GetMapping("/hello")
    public String getHelloWorld() {
        return "Hello World!";
    }

    @GetMapping("/capitalize/{upperCase}")
    // Ref: https://stackoverflow.com/questions/20713522/missing-uri-template-variable-studentid-for-method-parameter-type-java-lang-i
    public String capIt(@PathVariable("upperCase") String value) {
        return value.toUpperCase();
    }

    @GetMapping("/reverse")
    public String reverseIt(@RequestParam(name = "sentence", required = false, defaultValue = "reverse String") String value) {

        String[] result = value.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = result.length - 1; i > -1; i--) {
            sb.append(result[i] + " ");
        }
        String reversed = sb.toString();
        return reversed.trim(); //trim() need due to extra empty space added to the result
    }
}