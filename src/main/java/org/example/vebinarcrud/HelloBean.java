package org.example.vebinarcrud;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
    private String message;

    public HelloBean() {
        this.message = "Привет, мир!";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
