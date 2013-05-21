package com.git_training;

public class Publisher {
    private String message;
    private static Integer id;

    public String getMessage () {
        return message;
    }

    public Integer getId () {
        return id++;

    }

    public void setMessage (String message) {
        this.message = message;
    }

    @Override
    public String toString () {
        return "Pubslisher is:\n" + "\tMessage: " + message + "\n" + "\tId: " + getId();
    }
}
