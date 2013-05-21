package com.git_training;

public class Publisher {
    private String message;

    public String getMessage () {
        return message;
    }

    public void setMessage (String message) {
        this.message = message;
    }

    @Override
    public String toString () {
        return message;
    }
}
