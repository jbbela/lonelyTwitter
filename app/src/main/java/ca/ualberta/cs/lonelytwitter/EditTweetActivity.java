/*
 * Copyright (c) 2017. Team X. CMPUT301. University of Alberta. All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of Code of Student
 * Behavior at University of Alberta.
 * You can find a copy of the license in the project. Otherwise, please contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        Bundle bundle = getIntent().getExtras();
        String testString = bundle.getString("testString");

    }
}
