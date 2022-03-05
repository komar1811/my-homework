package org.epam.poland.aqa.course.homework;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.epam.poland.aqa.course.homework.Data.AMAZON_LOCATION;

public class TaskTest {

    @Test
    public void TaskTest11() {
        Assert.assertTrue(Tasks.Task11().contains("99801"));
    }
    @Test
    public void testTask12() {
        Assert.assertTrue(Tasks.Task12());
    }

    @Test
    public void testTask13() { Assert.assertTrue(Tasks.Task13());
    }
}
