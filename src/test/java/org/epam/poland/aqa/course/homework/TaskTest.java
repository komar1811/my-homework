package org.epam.poland.aqa.course.homework;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.epam.poland.aqa.course.homework.Data.AMAZON_LOCATION;

public class TaskTest {

    @Test
    public void testTask11() {
        String check = Tasks.Task11();
        Assert.assertTrue(check.contains(AMAZON_LOCATION));
    }
    @Test
    public void testTask12() {
        Assert.assertTrue(Tasks.Task12());
    }

    @Test
    public void testTask13() {
        Assert.assertTrue(Tasks.Task13());
    }

}
