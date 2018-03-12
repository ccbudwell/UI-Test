package com.example.carolinebudwell.uitests;

import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by carolinebudwell on 3/10/18.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class SecondTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);


    @Test
    public void test2ChatId() {
        onView(withId(R.id.buttonClear)).perform(click());
        //onView(withId(R.id.buttonClear)).perform(click());
        onView(withId(R.id.textViewHello)).check(matches(withText(R.string.hello_world)));
        //onView(withId(R.id.textViewHello)).check(matches(withText("Clear")));
    }

}