package com.firebase.androidchat;

/**
 * @author greg
 * @since 6/21/13
 */
public class Chat {

    private String message;
    private String author;
    private long timestamp;

    // Required default constructor for Firebase object mapping
    @SuppressWarnings("unused")
    private Chat() {
    }

    Chat(String message, String author, long timestamp) {
        this.message = message;
        this.author = author;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }

    public long getTimestamp() {return timestamp;}
}
