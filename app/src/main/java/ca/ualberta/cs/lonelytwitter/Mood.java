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

    public Mood(String mood) {
        this.mood = mood;    // sets new mood
        this.date = new Date();    // date not specified, so set default date
    }

    public Mood(Date date, String mood) {
        this.mood = mood;    // sets new mood
        this.date = date;    // sets specified date
    }

    public Date getDate() {
        return date;    // returns the date
    }

    public void setDate(Date date) {
        this.date = date;    // sets specified date
    }

    public String getMood() {
        return mood;    // returns the mood
    }

    public void setMood(String mood) {
        this.mood = mood;    // sets the mood
    }

    public abstract String returnString();    // returns string
}
