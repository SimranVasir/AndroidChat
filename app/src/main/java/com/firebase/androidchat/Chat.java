package com.firebase.androidchat;

public class Chat {

    private String message;
    private String author;
    private String recipient;
    private long timestamp;

    // Required default constructor for Firebase object mapping
    @SuppressWarnings("unused")
    private Chat() {
    }

    Chat(String message, String author, String recipient, long timestamp) {
        this.message = message;
        this.author = author;
        this.recipient = recipient;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }

    public String getRecipient() {
        return recipient;
    }

    public long getTimestamp() {return timestamp;}
}
