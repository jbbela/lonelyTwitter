package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by belardo on 1/19/17.
 */

/**
 * Non-abstract class that represents the mood Excited; inherits from the Mood class.
 */
public class Excited extends Mood {
    public Excited() {
        super("Excited");    // only passes current mood, so default date will be set
    }

    public Excited(Date date) {
        super(date, "Excited");    // takes date as argument to set with current mood
    }

    public String returnString() {
        return "I am Excited!";    // format method which returns a string representing the mood excited
    }

}
