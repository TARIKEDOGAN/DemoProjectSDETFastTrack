package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.DropDownPage;
import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DropdownTests1 {
    DropDownPage dropDownPage=new DropDownPage();

    @Test
    public void dropDownTest1(){
        //TC#1
        //1. Go to http://practice.cybertekschool.com/dropdown

        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");

        Select stateSelect=new Select(dropDownPage.stateSelector);

        //2. Select Illinois --> select by visible text
        stateSelect.selectByVisibleText("Illinois");
        String expected="Illinois";
        String actual=stateSelect.getFirstSelectedOption().getText();
        assertEquals(actual,expected,"Illinois was not selected");

        //3. Select Virginia --> select by value
        stateSelect.selectByValue("VA");
        expected="Virginia";
        actual=stateSelect.getFirstSelectedOption().getText();
        assertEquals(actual,expected,"Virginia was not selected");

        //4. Select California --> select by index
        stateSelect.selectByIndex(5);
        //5. Verify final selected option is California.

        expected="California";
        actual=stateSelect.getFirstSelectedOption().getText();
        assertEquals(actual,expected,"California was not selected");
    }

}
