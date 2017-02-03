package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by belardo on 1/19/17.
 */

/**
 * Class of ImportantTweet object that holds a tweet's message and date; is considered important.
 * Inherits from the Tweet class.
 */
public class ImportantTweet extends Tweet {
    /**
    * Instance of new ImportantTweet. Given string is message; sets current date as date.
    * @param message
    */
    public ImportantTweet(String message) {
        super(message);
    }

    /**
    * Instance of new ImportantTweet. Given string is message; given date is set as date.
    */
    public ImportantTweet(Date date, String message) {
        super(date, message);
    }
    
    /**
    * Determines if tweet is important or not; always returns true.
    * @return true
    */
    @Override
    public Boolean isImportant() {
        return true;    // returns true if it is an ImportantTweet
    }
}
