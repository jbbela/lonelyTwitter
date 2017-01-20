package ca.ualberta.cs.lonelytwitter;

/**
 * Created by belardo on 1/19/17.
 */

/**
 * Everything in an interface must be public. Modifier public is redundant.
 */
public interface Tweetable {
    public String getMessage();
    public void setMessage(String string) throws TweetTooLongException;

}
