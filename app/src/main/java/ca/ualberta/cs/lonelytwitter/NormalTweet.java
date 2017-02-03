package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by belardo on 1/19/17.
 */

/**
 * Subclass of Tweet that is used to hold a tweet's message and date; is not considered
 * important.
 * Inherits from Tweet class
 */
public class NormalTweet extends Tweet {
    /**
    * Instantiates new NormalTweet; takes in string message and sets date as current date.
    * 
    * @param message
    */
    public NormalTweet(String message) {
        super(message);
    }
    
    /**
    * Instantiates new NormalTweet; takes in string message and sets date as given date.
    *
    * @param date
    * @param message
    */
    public NormalTweet(Date date, String message) {
        super(date, message);
    }
    
    /**
    * Determines if tweet is important or not.
    *
    * @return false
    **/
    @Override
    public Boolean isImportant() {
        return false;   // it is only a NormalTweet, so it is not important; return false
    }
}
