package com.gunt.kakaosearchrevision.ui

import android.content.Intent
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.gunt.kakaosearchrevision.R
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{
    private lateinit var activityScenario: ActivityScenario<MainActivity>

    @Before
    fun setUp() {
        activityScenario = ActivityScenario.launch<MainActivity>(Intent(ApplicationProvider.getApplicationContext(),MainActivity::class.java))
    }

    @After
    fun tearDown() {
        activityScenario.close()
    }

    @Test
    fun activityInViewTest() {
        //after created fragment
        onView(withId(R.id.main_container)).check(matches(isDisplayed()))
    }
}