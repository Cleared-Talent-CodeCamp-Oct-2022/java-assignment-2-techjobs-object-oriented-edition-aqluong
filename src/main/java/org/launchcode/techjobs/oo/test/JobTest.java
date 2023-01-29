package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
//import static org.junit.Assert.assertNotEquals;
import org.launchcode.techjobs.oo.Job;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void emptyTest(){
        assertEquals(1, 1);
    }

    @Test
    public void testSettingJobId(){
        Job jobOne = new Job();
        Job jobTwo = new Job();
        assertNotEquals(jobOne, jobTwo);
    }
}
