package ca.ualberta.cs.lonelytwitter;

/**
 * Created by belardo on 1/19/17.
 */

import java.util.Date;

/**
 * Non-abstract class that represents the mood Angry; inherits from the Mood class.
 */
public class Angry extends Mood{
    /**
    * Instantiates Angry mood; current date set.
    */
    public Angry() {
        super("Angry");    
    }

    /**
    * Instantiates Angry mood; specified date set.
    */
    public Angry(Date date) {
        super(date, "Angry");
    }

    /**
    * Format method returns string representing Angry mood
    * @return string
    */
    public String returnString() {
        return "I am Angry!!!";  
    }
}
