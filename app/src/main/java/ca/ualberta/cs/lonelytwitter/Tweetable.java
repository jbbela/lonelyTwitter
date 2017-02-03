package ca.ualberta.cs.lonelytwitter;

/**
 * Created by belardo on 1/19/17.
 */

/**
 * Public interface Tweetable extended by Tweet; used to get message and set message
 * Everything in an interface must be public
 */
public interface Tweetable {
    public String getMessage();
    public void setMessage(String string) throws TweetTooLongException;

}
