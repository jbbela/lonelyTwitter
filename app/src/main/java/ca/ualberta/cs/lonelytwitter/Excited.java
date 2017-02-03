package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by belardo on 1/19/17.
 */

/**
 * Non-abstract class that represents the mood Excited; inherits from the Mood class.
 */
public class Excited extends Mood {
    /**
    * Instantiates Excited mood; current date set.
    */
    public Excited() {
        super("Excited");
    }

    /**
    * Instantiates Angry mood; specified date set.
    * @param date
    */
    public Excited(Date date) {
        super(date, "Excited"); 
    }

    /**
    * Format method returns string representing Excited mood.
    * @return string
    */
    public String returnString() {
        return "I am Excited!";
    }

}
