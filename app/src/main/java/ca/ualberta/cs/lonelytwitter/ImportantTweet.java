package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by belardo on 1/19/17.
 */

/**
 * Class of ImportantTweet object that holds a tweet's message and date; is considered important
 * Inherits from the Tweet class
 */
public class ImportantTweet extends Tweet {
    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    public Boolean isImportant() {
        return true;    // returns true if it is an ImportantTweet
    }
}
