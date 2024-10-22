package com.firebase.androidchat;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import com.firebase.client.Query;

/**
 * @author greg
 * @since 6/21/13
 *
 * This class is an example of how to use FirebaseListAdapter. It uses the <code>Chat</code> class to encapsulate the
 * data for each individual chat message
 */
public class ConversationListAdapter extends FirebaseListAdapter<Conversation> {

    // The mUsername for this client. We use this to indicate which messages originated from this user
    private String mUsername;

    public ConversationListAdapter(Query ref, Activity activity, int layout, String mUsername) {
        super(ref, Conversation.class, layout, activity);
        this.mUsername = mUsername;
    }

    /**
     * Bind an instance of the <code>Chat</code> class to our view. This method is called by <code>FirebaseListAdapter</code>
     * when there is a data change, and we are given an instance of a View that corresponds to the layout that we passed
     * to the constructor, as well as a single <code>Chat</code> instance that represents the current data to bind.
     *
     * @param view A view instance corresponding to the layout we passed to the constructor.
     * @param conversation An instance representing the current state of a chat message
     */
    @Override
    protected void populateView(View view, Conversation conversation) {
        // Map a Chat object to an entry in our listview
        String participant1 = conversation.getParticipants()[0];
        String participant2 = conversation.getParticipants()[1];

        TextView participant1TV = (TextView) view.findViewById(android.R.id.text1);
        TextView participant2TV = (TextView) view.findViewById(android.R.id.text2);

        participant1TV.setText(participant1);
        participant2TV.setText(participant2);
    }
}
