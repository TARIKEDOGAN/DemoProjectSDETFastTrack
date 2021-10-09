package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.SynchronizationPage;
import com.sdetfasttrack.utilities.Driver;
import org.testng.annotations.Test;

public class SynchronizationTests {

    SynchronizationPage synchronizationPage=new SynchronizationPage();

    @Test
    public void synchronizationTest1(){
        //TC#1
        //1. Go to http://practice.cybertekschool.com/dynamic_loading/1
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
        //2. Click to start
        //3. Wait until loading bar disappears
        //4. Assert username inputbox is displayed
        //5. Enter username: tomsmith
        //6. Enter password: incorrectpassword
        //7. Click to Submit button
        //8. Assert “Your password is invalid!” text is displayed.
    }
}
