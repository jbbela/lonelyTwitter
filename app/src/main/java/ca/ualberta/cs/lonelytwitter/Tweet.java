package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by belardo on 1/19/17.
 */


/**
 * Every Tweet has to pass a message; Abstract class that defines the Tweet object
 * Contains constructors, setters, and getters for tweets
 */

public abstract class Tweet implements Tweetable {    // implied to extend Object
    private Date date;
    private String message;
    private ArrayList<Mood> moodList;    // creates array for list of moods


    public Tweet(ArrayList<Mood> moodList) {
        this.moodList = moodList;    // sets list of moods
    }

    public void addMood(Mood newMood) {
        this.moodList.add(newMood);    // adds a new mood to the list
    }

    // call either one of the constructors to make a Tweet instance

    public Tweet(String message) {
        this.message = message;    // takes given string as message
        this.date = new Date();    // creates a Date instance in Java; default date
    }

    public Tweet(Date date, String message) {
        this.message = message;    // takes given string as message
        this.date = date;    // takes specificed date
    }

    public Date getDate() {
        return date;    // returns the date
    }

    public void setDate(Date date) {
        this.date = date;    // sets specific date
    }

    public String getMessage() {
        return message;    // returns the string message
    }


    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {    // character limit on Tweet
            throw new TweetTooLongException();
        }
        this.message = message;   // sets specific message
    }

    public abstract Boolean isImportant();    // has to be implemented in subclasses

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}