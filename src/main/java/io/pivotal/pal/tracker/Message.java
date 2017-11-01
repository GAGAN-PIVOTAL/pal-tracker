package io.pivotal.pal.tracker;

import org.springframework.stereotype.Service;

@Service
public class Message {
    private String message;

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
