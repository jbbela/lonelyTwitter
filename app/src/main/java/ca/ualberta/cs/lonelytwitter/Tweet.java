package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by belardo on 1/19/17.
 */


/**
 * Every Tweet has to have a message; Abstract class that defines the Tweet object
 * Contains constructors, setters, and getters for tweets
 */

public abstract class Tweet implements Tweetable {    // implied to extend Object
    private Date date;
    private String message;
    private ArrayList<Mood> moodList;    // creates array for list of moods

    /**
    * Sets list of moods.
    *
    * @param moodList
    */
    public Tweet(ArrayList<Mood> moodList) {
        this.moodList = moodList;    // sets list of moods
    }
    
    /**
    * Adds new mood to list.
    *
    * @param newMood
    */
    public void addMood(Mood newMood) {
        this.moodList.add(newMood);    // adds a new mood to the list
    }

    /**
    * Initializes tweet with given string message and current date.
    *
    * @param message
    */
    public Tweet(String message) {
        this.message = message;    // takes given string as message
        this.date = new Date();    // creates a Date instance in Java; default date
    }
    
    /**
    * Initializes tweet with given string message and given date.
    *
    * @param date
    * @param message
    */
    public Tweet(Date date, String message) {
        this.message = message;    // takes given string as message
        this.date = date;    // takes specificed date
    }
    
    /**
    * Returns the date.
    *
    * @return date
    */
    public Date getDate() {
        return date;    // returns the date
    }

    /**
    * Sets specific date.
    *
    * @param date
    */
    public void setDate(Date date) {
        this.date = date;    // sets specific date
    }
    
    /**
    * Returns the message.
    *
    * @return message
    */
    public String getMessage() {
        return message;    // returns the string message
    }

    /**
    * Sets message for tweet and throws TweetTooLongException if 140 char. limit
    * is exceeded.
    *
    * @param message
    * @trows TweetTooLongException
    */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {    // character limit on Tweet
            throw new TweetTooLongException();
        }
        this.message = message;   // sets specific message
    }

    /**
    * Determines if tweet is important or not (true or false)
    *
    * @return boolean
    */
    public abstract Boolean isImportant();    // has to be implemented in subclasses
    
    /**
    * Returns string of date and message
    */
    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
