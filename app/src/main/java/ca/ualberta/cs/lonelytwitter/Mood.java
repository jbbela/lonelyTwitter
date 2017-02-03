package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by belardo on 1/19/17.
 */

/**
 * Abstract base class Mood that represents the user's current mood; each mood is made up of a
 * mood and date
 * Contains setters and getters for moods and dates, as well as returns a string
 */

public abstract class Mood {
    private Date date;
    private String mood;
    
    /**
    * Sets new mood with current date.
    * @param mood
    */
    public Mood(String mood) {
        this.mood = mood; 
        this.date = new Date();
    }
    
    /**
    * Sets new mood with given date.
    * @ param date
    * @ param mood
    */
    public Mood(Date date, String mood) {
        this.mood = mood; 
        this.date = date;
    }
    
    /**
    * Returns the date.
    * @return date
    */
    public Date getDate() {
        return date;  
    }

    /**
    * Sets date.
    * @param date
    */
    public void setDate(Date date) {
        this.date = date; 
    }

    /**
    * Returns the mood.
    * @return mood
    */
    public String getMood() {
        return mood;
    }

    /**
    * Sets the mood.
    * @param mood
    */
    public void setMood(String mood) {
        this.mood = mood;
    }

    /**
    * For subclasses; format returns string
    */
    public abstract String returnString();
}
