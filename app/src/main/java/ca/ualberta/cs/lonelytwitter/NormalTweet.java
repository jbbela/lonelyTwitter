package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by belardo on 1/19/17.
 */

/**
 * Class of NormalTweet object that is used to hold a tweet's message and date; is not considered
 * important.
 * Inherits from Tweet class
 */
public class NormalTweet extends Tweet {
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    public Boolean isImportant() {
        return false;   // it is only a NormalTweet, so it is not important; return false
    }
}
