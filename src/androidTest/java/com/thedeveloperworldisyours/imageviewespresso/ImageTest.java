package com.thedeveloperworldisyours.imageviewespresso;

import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by javierg on 17/06/16.
 */
public class ImageTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkImage() {
        onView(withId(R.id.activity_main_image))
                .check(ViewAssertions.matches(EspressoTestsMatchers.noDrawable()));

        onView(withId(R.id.activity_main_button))
                .perform(ViewActions.click());

        onView(withId(R.id.activity_main_image))
                .check(ViewAssertions.matches(EspressoTestsMatchers.withDrawable(R.drawable.the_developer_world_is_yours)));
    }
}
