package com.firebase.androidchat;

public class Conversation {

    private String participant1;
    private String participant2;

    // Required default constructor for Firebase object mapping
    @SuppressWarnings("unused")
    private Conversation() {
    }

    Conversation(String participant1, String participant2) {
        this.participant1 = participant1;
        this.participant2 = participant2;
    }

    public String getParticipant1() {
        return participant1;
    }

    public String getParticipant2() {
        return participant2;
    }

    public String[] getParticipants() {
        return new String[] {participant1, participant2};
    }
}
