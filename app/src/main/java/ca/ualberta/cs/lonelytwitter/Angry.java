package ca.ualberta.cs.lonelytwitter;

/**
 * Created by belardo on 1/19/17.
 */

import java.util.Date;

/**
 * Non-abstract class that represents the mood Angry; inherits from the Mood class.
 */
public class Angry extends Mood{
    public Angry() {
        super("Angry");    // only passes current mood so default date will be set
    }

    public Angry(Date date) {
        super(date, "Angry");    // specifies date, so it is also set with current mood
    }

    public String returnString() {
        return "I am Angry!!!";    // format method returns a string representing the mood Angry
    }
}
